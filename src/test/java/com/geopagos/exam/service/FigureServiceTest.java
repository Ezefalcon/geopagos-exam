package com.geopagos.exam.service;

import com.geopagos.exam.domain.Figure;
import com.geopagos.exam.domain.Polygon;
import com.geopagos.exam.domain.Square;
import com.geopagos.exam.repository.SquareRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FigureServiceTest {

    @Autowired
    SquareRepository repository;

    @Autowired
    FigureService figureService;

    @Test
    public void testPersistence() {
        Square figure = new Square();
        figure.setHeight(22D);
        figure.setBase(22D);
        Figure save = figureService.save(figure);
        Optional<Square> byId = repository.findById(save.getId());
        assertTrue(byId.isPresent());
    }
}
