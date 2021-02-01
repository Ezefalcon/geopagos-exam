package com.geopagos.exam.domain;

import com.geopagos.exam.controller.dto.FigureDTO;

public class FigureFactory {
    private FigureFactory() {}

    public static Figure get(FigureDTO figureDTO) {
        FigureType figureType = figureDTO.getFigureType();
        switch (figureType) {
            case CIRCLE:
                return new Circle(figureDTO.getRadius());
            case SQUARE:
                return new Square(figureDTO.getBase(), figureDTO.getHeight());
            case TRIANGLE:
                return new Triangle(figureDTO.getBase(), figureDTO.getHeight());
            default:
                throw new IllegalArgumentException();
        }
    }
}
