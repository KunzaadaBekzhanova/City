package com.company;

import java.util.Objects;

public class City implements Comparable<City>{
    private int code;
    private String name;
    private String location;
    private int population;

    public City(int code, String name, String location, int population) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.population = population;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && population == city.population && Objects.equals(name, city.name) && Objects.equals(location, city.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, location, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(o.getCode(),this.code);
    }
}
