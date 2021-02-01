package com.geopagos.exam.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Circle extends Figure {

    private double radius;

    @Override
    public double getArea() {
        return (2*Math.PI) * (radius * radius);
    }

    @Override
    public double getBase() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public FigureType getType() {
        return FigureType.CIRCLE;
    }
}
