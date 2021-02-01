package com.geopagos.exam.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Triangle extends Polygon {

    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getDiameter() {
        return 0;
    }

    @Override
    public FigureType getType() {
        return FigureType.TRIANGLE;
    }
}
