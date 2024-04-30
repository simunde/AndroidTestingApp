package com.msid.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {


    @Before
    fun setUp(){
        println("Before Every Test Case")
    }

    @After
    fun tearDown(){
        println("After Every Test Case")
    }
    @Test
    fun isPalindrome() {

        val helper = Helper()

        val result = helper.isPalindrome("")

        assertEquals(true,result)
    }


    @Test
    fun isPalindrome_inputString_level_expectedTrue() {

        //Arrange
        val helper = Helper()

        //Act
        val result = helper.isPalindrome("a")

        //Assert
        assertEquals(true,result)
    }
}