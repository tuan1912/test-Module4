package com.example.testmodule4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty(message = "không được để trống")
    private String nameCity;
    @NotEmpty(message = "không được để trống")
    private int area;
    @NotEmpty(message = "không được để trống")
    private long population;
    @NotEmpty(message = "không được để trống")
    private long gdp;
    @NotEmpty(message = "không được để trống")
    private String describeTheCity;

    @ManyToOne
    private Country country;

    public City(String nameCity, int area, long population, long gdp, String describeTheCity, Country country) {
        this.nameCity = nameCity;
        this.area = area;
        this.population = population;
        this.gdp = gdp;
        this.describeTheCity = describeTheCity;
        this.country = country;
    }
}
