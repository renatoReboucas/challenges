package com.rr.challenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_conversor.*
import utils.utilidade

class ConversorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        val temp = arrayListOf(
            "Selecione uma temperatura:",
            "Celsius",
            "Kelvin",
            "Fahrenheit"
        )

        val adpter = ArrayAdapter(this@ConversorActivity, android.R.layout.simple_spinner_item, temp)

        spinner.adapter = adpter

        spinner.setOnItemSelectedListener(object: AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                txt_result.text = "Você escolheu: ${temp[position]}"
                var valor = temp[position]

                if ( valor == "Celsius"){
//                    txt_result.text = "Você escolheu: ${temp[position]}"
                var res = calcC(valor)
                Log.d("spn", "$res")
                }else{
                    txt_result.text = "Nao sei oq escolheu"
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        })

        btn_voltar.setOnClickListener {
            finish()
        }


    }

    private fun isValid(): Boolean {
        return input_numb.text.toString() != ""

    }

    fun calcC(valor: String): String{
                var nome = "errou"
                var numb = input_numb.editableText.toString().toInt()

//        if ( valor == "Celsius" ){
//             nome =  "Celsius"
//        }
//        if (valor == "Kelvin"){
//             nome = "Kelvin"
//        }


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


//        return "entrou calcC"
    }

}
