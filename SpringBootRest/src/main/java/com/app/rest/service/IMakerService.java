package com.app.rest.service;

import com.app.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {
    List<Maker> findAll();
    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);
}
