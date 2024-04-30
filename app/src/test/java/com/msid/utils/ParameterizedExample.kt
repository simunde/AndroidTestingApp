package com.msid.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters


@RunWith(value = Parameterized::class)
class ParameterizedExample(private val input: String, private val expectedValue: Boolean) {

    @Test
    fun test(){
        val helper = Helper()

        val result = helper.isPalindrome(input)

        assertEquals(expectedValue,result)
    }

    companion object{

        @JvmStatic
        @Parameters(name = "{index}: {0} is palindrome - {1}" )
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("",true),
                arrayOf("a",true),
                arrayOf("level",true)

            )
        }
    }


}