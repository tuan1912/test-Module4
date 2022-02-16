package com.example.testmodule4.service;

import com.example.testmodule4.model.City;

import java.util.List;

public interface IServiceCity {
    List<City> findAll();

    City findById(long id);

    City save(City city);

    void delete(City city);
}
