package com.kodilla.testing.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite{
    @Test
    public void testCalculateForecastWithStub() throws Exception{
        //        Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        //        When
        int qunatitiOfSensors = weatherForecast.calculateForecast().size();

        //        Then
        Assert.assertEquals(5, qunatitiOfSensors);
    }
}