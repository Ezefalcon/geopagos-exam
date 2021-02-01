package com.geopagos.exam.domain;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Figure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Getter
    private int id;

    public abstract double getArea();
    public abstract double getBase();
    public abstract double getHeight();
    public abstract double getDiameter();
    public abstract FigureType getType();
}
