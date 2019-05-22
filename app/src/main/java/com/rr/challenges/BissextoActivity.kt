package com.rr.challenges

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bissexto.*
import kotlinx.android.synthetic.main.activity_bissexto.input_numb

class BissextoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bissexto)
    }

     fun calcAno(view: View) {

        if (isValid()) {
            val input = input_numb.editableText.toString().toInt()
            val calcQuatro = input % 4
            val calcCem = input % 100
            val calcQuatrocentos = input % 400

            Log.d("conta", "4: $calcQuatro")
            Log.d("conta", "100: $calcCem")
            Log.d("conta", "400: $calcQuatrocentos")

            if (calcQuatro == 0 && calcCem !== 0 || calcQuatrocentos == 0) {
                txt_result.setText("Ano é Bissexto")
                txt_result.setTextColor(Color.GREEN)
            } else {
                txt_result.setText("Ano não é Bissexto")
                txt_result.setTextColor(Color.RED)
            }
        }else{
            Toast.makeText(this@BissextoActivity,"Por favor preencha os valores solicitados!", Toast.LENGTH_LONG).show()
        }

    }

    fun backAno(view: View) = finish()

    private fun isValid(): Boolean {
        return input_numb.text.toString() != ""

    }
}
