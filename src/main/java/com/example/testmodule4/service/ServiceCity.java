package com.example.testmodule4.service;

import com.example.testmodule4.model.City;
import com.example.testmodule4.repository.IRepoCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCity implements IServiceCity {
    @Autowired
    IRepoCity iRepoCity;

    @Override
    public List<City> findAll() {
        return (List<City>) iRepoCity.findAll();
    }

    @Override
    public City findById(long id) {
        return iRepoCity.findById(id).get();
    }

    @Override
    public City save(City city) {
        return iRepoCity.save(city);
    }

    @Override
    public void delete(City city) {
        iRepoCity.delete(city);
    }
}
