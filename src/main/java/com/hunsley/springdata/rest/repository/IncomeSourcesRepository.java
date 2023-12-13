package com.hunsley.springdata.rest.repository;

import com.hunsley.springdata.rest.model.IncomeSource;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = IncomeSource.class)
public interface IncomeSourcesRepository extends PagingAndSortingRepository<IncomeSource, Long> {
}
