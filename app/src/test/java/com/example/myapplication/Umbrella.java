package com.example.myapplication;

public class Umbrella {
    fun totalPrice(count: Int , price: Int): Int{
        val weather = Weather()
        val isSunny = weather.isSunny()
        val total = count * price
        if (isSunny){
            total = (total * 0.9).toInt()
        }
        return totalPrice()

    }
}
