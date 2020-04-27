package world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite{

    @Test
    public void getPeopleQuantityTest(){
        //GIVEN
        World world = new World();
        //When
        world.getContinentSet().stream().flatMap(continent -> continent.countrySet.stream()).forEach(country -> country.setPeopleQuantity(new BigDecimal(10000000)));
        BigDecimal output = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("100000000");
        //THEN
        Assert.assertEquals(expected, output);

    }
}