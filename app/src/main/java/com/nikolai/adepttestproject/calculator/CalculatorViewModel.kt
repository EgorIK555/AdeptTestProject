package com.nikolai.adepttestproject.calculator

class CalculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun plus(firstNumber: Int, secondNumber: Int): Int{
        return firstNumber+secondNumber
    }

    fun minus(firstNumber: Int, secondNumber: Int): Int{
        return firstNumber-secondNumber
    }

    fun updateFirst(value: String){
        currentFirstString = value
    }

    fun updateSecond(value: String){
        currentSecondString = value
    }
}