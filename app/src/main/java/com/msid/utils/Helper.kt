package com.msid.utils

class Helper {

    fun isPalindrome(s:String): Boolean {
        var i=0
        var j=s.length-1
        var result = true
        while (i<j){
            if (s[i]!=s[j]){
                result= false
                break
            }
            i++
            j--

        }
        return result
    }
}