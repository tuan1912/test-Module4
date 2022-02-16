package com.example.testmodule4.service;

import com.example.testmodule4.model.Country;

import java.util.List;

public interface IServiceCountry {
    List<Country> findAll();

    Country findById(long id);

    Country save(Country country);

    void delete(Country country);
}
