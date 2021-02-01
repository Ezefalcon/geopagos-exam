package com.geopagos.exam.repository;

import com.geopagos.exam.domain.FigureType;
import com.geopagos.exam.domain.Square;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SquareRepository extends FigureRepository<Square> {

    default FigureType getFigureType() {
        return FigureType.SQUARE;
    }
}
