package com.geopagos.exam.repository;

import com.geopagos.exam.domain.FigureType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FigureRepository<Figure> extends JpaRepository<Figure, Integer> {
    FigureType getFigureType();
}
