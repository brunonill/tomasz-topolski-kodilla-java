package com.kodilla.stream.world;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent{
    String continentName;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(continentName, continent.continentName) &&
                Objects.equals(countrySet, continent.countrySet);
    }

    @Override
    public int hashCode(){
        return Objects.hash(continentName, countrySet);
    }

    public Continent(String continentName){
        this.continentName = continentName;
    }

    public Set<Country> getCountrySet(){
        return countrySet;
    }

    Set<Country> countrySet = new HashSet<>();

    public void add(Country... country){
        countrySet.addAll(Arrays.asList(country));
    }
}
