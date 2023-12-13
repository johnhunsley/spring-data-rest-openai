package com.hunsley.springdata.rest.repository;

import com.hunsley.springdata.rest.model.IncomeSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = IncomeSource.class)
public interface IncomeSourceRepository extends JpaRepository<IncomeSource, Long> {
}
