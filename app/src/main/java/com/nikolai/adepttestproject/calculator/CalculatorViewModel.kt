package com.nikolai.adepttestproject.calculator

class CalculatorViewModel {

    private var currentFirstString: String = ""
    private var currentSecondString: String = ""

    fun plus(): Int{
        checkParameters()
        return currentFirstString.toInt() + currentSecondString.toInt()
    }

    fun minus(): Int{
        checkParameters()
        return currentFirstString.toInt() - currentSecondString.toInt()
    }

    fun mult(): Int{
        checkParameters()
        return currentFirstString.toInt() * currentSecondString.toInt()
    }

    fun div(): Int{
        checkParameters()
        val second= currentSecondString.toInt()
        if (second != 0)
        {
            return currentFirstString.toInt() / currentSecondString.toInt()
        }
        else
        {
            throw Exception("Деление на 0")
        }
    }

    fun updateFirst(value: String){
        currentFirstString = value
    }

    fun updateSecond(value: String){
        currentSecondString = value
    }

    fun checkParameters(){
        if(currentFirstString != "" || currentSecondString != ""){
            throw Exception("Одно из полей пустое!")
        }
    }
}