package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country{
    private final String countryName;

    public void setPeopleQuantity(BigDecimal peopleQuantity){
        this.peopleQuantity = peopleQuantity;
    }

    private BigDecimal peopleQuantity;



    @Override
    public String toString(){
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(countryName, country.countryName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(countryName, peopleQuantity);
    }

    public String getCountryName(){
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }

    public Country(final String countryName){
        this.countryName = countryName;
        peopleQuantity =null;
    }
}
