package com.app.rest.repository;

import com.app.rest.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository<Maker,Long> {
}
