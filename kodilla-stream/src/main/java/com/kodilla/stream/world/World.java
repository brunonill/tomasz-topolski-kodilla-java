package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class World{

    public Set<Continent> getContinentSet(){
        return continentSet;
    }

    private final Set<Continent> continentSet = new HashSet<>();

    private void addContinent(Continent... continent){
        continentSet.addAll(Arrays.asList(continent));
    }

    public World(){

        Country france = new Country("France");
        Country spain = new Country("Spain");
        Country canada = new Country("Canada");
        Country brasil = new Country("Brasil");
        Country china = new Country("China");
        Country japan = new Country("Japan");
        Country usa = new Country("USA");
        Country rpa = new Country("RPA");
        Country egypt = new Country("Egypt");
        Country peru = new Country("Peru");

        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");

        africa.add(rpa,egypt);
        asia.add(japan,china);
        northAmerica.add(canada,usa);
        europe.add(spain,france);
        southAmerica.add(brasil,peru);

        this.addContinent(africa, asia, europe, northAmerica, southAmerica);

    }

    BigDecimal getPeopleQuantity(){

        return (BigDecimal) continentSet.stream()
                .flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
