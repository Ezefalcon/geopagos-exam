package com.geopagos.exam.domain;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
public class Square extends Polygon {

    public Square(double base, double height) {
        super(base, height);
    }

    @Override
    public double getArea() {
        return this.base * this.base;
    }

    @Override
    public double getDiameter() {
        return 0.0;
    }

    @Override
    public FigureType getType() {
        return FigureType.SQUARE;
    }
}
