package com.example.myapplication;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import kotlin.jvm.JvmStatic;

public class SimpleTest {
    @Before
    fun before(){
        println("brfore")
    }
    @Test
    fun test1() {
        println("test1")
    }
    @After
    fun after(){
        println("after")
    }
    @Test
    fun test2(){
        println("test2")
    }

    companion object{
        @JvmStatic
        @BeforeClass
        fun beforClass(){

        }
    }
}
