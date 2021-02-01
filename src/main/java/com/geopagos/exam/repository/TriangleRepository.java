package com.geopagos.exam.repository;

import com.geopagos.exam.domain.FigureType;
import com.geopagos.exam.domain.Square;
import com.geopagos.exam.domain.Triangle;
import org.springframework.stereotype.Repository;

@Repository
public interface TriangleRepository extends FigureRepository<Triangle> {
    default FigureType getFigureType() {
        return FigureType.TRIANGLE;
    }
}
