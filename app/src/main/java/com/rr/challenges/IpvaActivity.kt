package com.rr.challenges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AbsListView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ipva.*

class IpvaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ipva)

        val listStates = arrayListOf(
            "Escolha um Estado:",
            "Santa Catarina",
            "Rio Grande do Sul",
            "Paraná",
            "Espírito Santo",
            "São Paulo",
            "Rio de Janeiro",
            "Minas Gerais",
            "Sergipe",
            "Paraíba",
            "Alagoas",
            "Pernambuco",
            "Rio Grande do Norte",
            "Ceará",
            "Piauí",
            "Maranhão",
            "Bahia",
            "Acre",
            "Tocantins",
            "Pará",
            "Amapá",
            "Amazonas",
            "Roraima",
            "Rondônia",
            "Mato Grosso do Sul",
            "Goiás",
            "Mato Grosso",
            "Distrito Federal"
        )

        val adapterList = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,listStates)
        spn_state.adapter = adapterList

        spn_state.adapter = adapterList


    }

    fun voltarMenu(view: View) = finish()

}


//Santa Catarina: 2%
//-> Rio Grande do Sul: 3%
// -> Paraná: 3,5%
//
//Região Sudeste
//-> Espírito Santo: 2%
//-> São Paulo: 3%
//->​ ​Rio​ ​de​ ​Janeiro:​ ​4%
//->​ ​Minas​ ​Gerais:​ ​4%
//Região Nordeste
//->​ ​Sergipe:​ ​2%
//-> Paraíba: 2%
//->​ ​Alagoas:​ ​2,5%
//->​ ​Pernambuco:​ ​2,5%
//-> Rio Grande do Norte: 2,5%
//-> Ceará: 2,5%
//-> Piauí: 2,5%
// -> Maranhão: 2,5%
//-> Bahia: 2,5%
//Região Norte
//->​ ​Acre:​ ​2%
//-> Tocantins: 2%
// -> Pará: 2,5%
//-> Amapá: 3%
//-> Amazonas: 3%
// -> Roraima: 3%
//-> Rondônia: 3%
//Região Centro-Oeste
//-> Mato Grosso do Sul: 2,5%
// -> Goiás: 2,5
//->​ ​Mato​ ​Grosso:​ ​3%
//->​ ​Distrito​ ​Federal:​ ​3%