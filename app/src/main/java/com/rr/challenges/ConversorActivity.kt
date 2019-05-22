package com.rr.challenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_conversor.*
import utils.utilidade

class ConversorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        btn_voltar.setOnClickListener {
            finish()
        }

        btn_calc_conv.setOnClickListener {

            if (isValid()){

                var numb = input_numb.editableText.toString().toInt()

            }else{
                Toast.makeText(this@ConversorActivity,"Por favor preencha os valores solicitados!", Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun isValid(): Boolean {
        return input_numb.text.toString() != ""

    }

}
