package com.geopagos.exam.service;

import com.geopagos.exam.domain.Figure;
import com.geopagos.exam.domain.FigureType;
import com.geopagos.exam.repository.FigureRepository;
import com.geopagos.exam.service.exceptions.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FigureService {

    @Autowired
    List<FigureRepository> repositories;

    public Figure save(Figure figure) {
        FigureRepository figureRepository = getFigureRepository(figure.getType());
        return (Figure) figureRepository.save(figure);
    }

    private FigureRepository getFigureRepository(FigureType figureType) {
        return this.repositories.stream()
                .filter(repo -> repo.getFigureType().equals(figureType))
                .findFirst()
                .orElseThrow(() -> new ServiceException("Implementation error FigureRepository not found"));
    }

    public List<Figure> findAll() {
        return this.repositories.stream()
                .map(FigureRepository::findAll)
                .reduce((acc, list) -> {
                    acc.addAll(list);
                    return acc;
                })
                .orElse(new ArrayList());
    }

    public List<Figure> findAll(FigureType figureType) {
        FigureRepository figureRepository = getFigureRepository(figureType);
        return figureRepository.findAll();
    }
}
