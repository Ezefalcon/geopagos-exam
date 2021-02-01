package com.geopagos.exam.controller;

import com.geopagos.exam.controller.dto.FigureDTO;
import com.geopagos.exam.domain.Figure;
import com.geopagos.exam.domain.FigureFactory;
import com.geopagos.exam.domain.FigureType;
import com.geopagos.exam.service.FigureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/figure")
public class FigureController {

    @Autowired
    private FigureService figureService;

    @PostMapping
    public Figure saveFigure(@Valid @RequestBody FigureDTO figureDTO) {
        Figure figure = FigureFactory.get(figureDTO);
        return this.figureService.save(figure);
    }

    @GetMapping
    public List<Figure> findAll() {
        return this.figureService.findAll();
    }

    @GetMapping("/type/{figureType}")
    public List<Figure> findAllByType(@PathVariable("figureType") String figureType) {
        return this.figureService.findAll(FigureType.valueOf(figureType.toUpperCase()));
    }
}
