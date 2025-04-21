package com.example.myapplication;

import org.junit.Assert;
import org.junit.Test;

public class umbrellaTest {

    fun totalPrice_sunny(){
        val umbrella = Umbrella()
        val stubWeather = StubWeaher()
        val acctual = umbrella.totalPrice(count: 5, price: 200)
        val expected = 900
        Assert.assertEquals(expected, acctual);
    }

    @Test
    fun totalPrice_raining(){
        val umbrella = Umbrella()
        val stubWeather = StubWeaher()
        stubWeather.fakeIsSunny = false
        val acctual = umbrella.totalPrice(count: 5, price: 200)
        val expected = 1000
        Assert.assertEquals(expected, acctual);
    }
}
