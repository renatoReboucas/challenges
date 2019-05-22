package com.rr.challenges

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_desafio.*


class ActivityDesafio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_desafio)
    }

     fun calcNumber(view: View){

        if ( isValid() ) {
//        var id = view.id
            val numb1 = input_numb.editableText.toString().toInt()

            val resultCalc = numb1 % 2
            Log.d("d", "O resultado é $resultCalc");
            if (resultCalc == 0) {
                result.setText("O numero $numb1 é par")
                result.setTextColor(Color.GREEN)
            } else {
                result.setText("O numero $numb1 é impar")
                result.setTextColor(Color.RED)
            }
        }else{
            Toast.makeText(this@ActivityDesafio,"Por favor preencha os valores solicitados!",Toast.LENGTH_LONG).show()
        }

    }
     fun back(view: View) = finish()

    private fun isValid(): Boolean {
        return input_numb.text.toString() != ""

    }

}

