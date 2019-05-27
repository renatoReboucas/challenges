package com.rr.challenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_conversor.*

class ConversorActivity : AppCompatActivity() {
    private val logTag = "ConversorActivity"
    private val celcius = "Celsius"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        val temp = arrayListOf(
            "Selecione uma temperatura:",
            celcius,
            "Kelvin",
            "Fahrenheit"
        )

        val adpter = ArrayAdapter(this@ConversorActivity, android.R.layout.simple_spinner_item, temp)

        spinner.adapter = adpter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                //                txt_result.text = "Você escolheu: ${temp[position]}"
                val valor = temp[position]

//                if (valor == celcius) {
                //                    txt_result.text = "Você escolheu: ${temp[position]}"
                val res = calcC(valor)
                Log.d(logTag, res)
//                } else {
//                    txt_result.text = "Nao sei oq escolheu"
//                }
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

    fun calcC(valor: String): String {
        Log.d(logTag, "$valor ${valor == celcius}")
        val nome: String
        when (valor) {
            celcius -> {
                nome = "Graus ºC"
            }
            "Kelvin ->" -> {
                nome = "Graus Kelvin"
            }
            else -> {
                nome = "Não definido"
            }
        }


//        btn_calc_conv.setOnClickListener {
//
//
//
//            if (isValid()){
//                if ( valor == "Celsius" ){
//                    var nome =  "Celsius"
//                }
//                if (valor == "Kelvin"){
//                    var nome = "Kelvin"
//                }
//
//            }else{
//                Toast.makeText(this@ConversorActivity,"Por favor preencha os valores solicitados!", Toast.LENGTH_LONG).show()
//            }
//        }


        return nome
    }

}
