package com.hunsley.springdata.rest.repository;

import com.hunsley.springdata.rest.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FooRepository extends JpaRepository<Foo, Long> {
}
