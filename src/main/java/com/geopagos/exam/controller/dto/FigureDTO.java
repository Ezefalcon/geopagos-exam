package com.geopagos.exam.controller.dto;

import com.geopagos.exam.domain.FigureType;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class FigureDTO {
    private Double base;
    private Double height;
    private Double radius;
    private Double diameter;
    private Double area;
    @NotNull
    private FigureType figureType;
}
