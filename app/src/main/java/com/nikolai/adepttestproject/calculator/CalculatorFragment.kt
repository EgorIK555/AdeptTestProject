package com.nikolai.adepttestproject.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.nikolai.adepttestproject.R
import java.lang.Exception

class CalculatorFragment : Fragment() {
    private val viewModel : CalculatorViewModel = CalculatorViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculator,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.firstNumberInput)
        val secondNumber = view.findViewById<EditText>(R.id.secondNumberInput)
        val textResult = view.findViewById<TextView>(R.id.result)

        val plusButton = view.findViewById<Button>(R.id.plusButton)
        plusButton.setOnClickListener {
            try {
                val userResult = viewModel.plus()
                textResult.text = userResult.toString()
            }
            catch(error:Exception){
                textResult.text = error.message
            }
        }
        val minusButton = view.findViewById<Button>(R.id.minusButton)
        minusButton.setOnClickListener {
            try {
                val userResult = viewModel.minus()
                textResult.text = userResult.toString()
            }
            catch(error:Exception){
                textResult.text = error.message
            }

        }
        val divButton = view.findViewById<Button>(R.id.divButton)
        divButton.setOnClickListener {
            try{
                val userResult = viewModel.div()
                textResult.text = userResult.toString()
            }
            catch(error:Exception){
                textResult.text = error.message
            }

        }
        val multButton = view.findViewById<Button>(R.id.multButton)
        multButton.setOnClickListener {
            try {
                val userResult = viewModel.mult()
                textResult.text = userResult.toString()
            }
            catch(error:Exception){
                textResult.text = error.message
            }

        }

        firstNumber.addTextChangedListener{ fieldValue ->
            viewModel.updateFirst(fieldValue.toString())
        }

        secondNumber.addTextChangedListener { fieldValue ->
            viewModel.updateSecond(fieldValue.toString())
        }
    }
}