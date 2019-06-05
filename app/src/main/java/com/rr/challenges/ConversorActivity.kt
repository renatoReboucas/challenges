package com.rr.challenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_conversor.*
import java.math.BigDecimal

class ConversorActivity : AppCompatActivity() {
    private val logTag = "ConversorActivity"
    private var celcius = "Celsius"
    private val kelvin = "Kelvin"
    private val fahrenheit = "Fahrenheit"

    override fun onCreate(savedInstanceState: Bundle?) {
        var valor: String = ""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        val temp = arrayListOf(
            "Selecione uma temperatura:",
            //celcius,
            kelvin,
            fahrenheit
        )

        val adpter = ArrayAdapter(this@ConversorActivity, android.R.layout.simple_spinner_item, temp)

        spinner.adapter = adpter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //                txt_result.text = "Você escolheu: ${temp[position]}"
                val valor = temp[position]


                btn_calc_conv.setOnClickListener {

                    if(isValid()){
                        val res = calcC(valor)
                        Log.d(logTag, "valor $res")
                        txt_result.setText("O resusultado é: $res")
                        input_numb.setText("")
                    }else{
                        Toast.makeText(this@ConversorActivity,"Preencha o unico campo existente",Toast.LENGTH_LONG).show()
                    }
                }


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }

        btn_voltar.setOnClickListener {
            finish()
        }


    }

    private fun isValid(): Boolean {
        return input_numb.text.toString() != ""

    }

    fun calcC(valor:String): String {
//        Log.d(logTag, "$valor ${valor == celcius}")
        if (input_numb.editableText.isEmpty()){
            return valor
        }
        val celcius = input_numb.editableText.toString().toDouble()
        var nome: String = ""
        when (valor) {
//            celcius -> {
//                nome = "Graus ºC"
//            }
            fahrenheit -> {
                val calc = (celcius * 1.8 + 32).toLong()
//                val nome = calc
                return calc.toString()
            }
            kelvin -> {
            val calc = (celcius + 273.15).toLong()
                return calc.toString()
            }
            else -> {
               val nome = "Não definido"
            }
        }


        return nome.toString()
    }

}
