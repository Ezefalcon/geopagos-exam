package com.geopagos.exam.repository;

import com.geopagos.exam.domain.Circle;
import com.geopagos.exam.domain.FigureType;

public interface CircleRepository extends FigureRepository<Circle> {
    default FigureType getFigureType() {
        return FigureType.CIRCLE;
    }
}
