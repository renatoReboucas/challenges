package com.rr.challenges

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LauncherActivity : AppCompatActivity() {

    protected val intent = this@LauncherActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        Handler().postDelayed({

            val intentMain = Intent(intent, MainActivity::class.java)

            // iniciando a Intent
            startActivity(intentMain)

            // finalizando o launch
            finish()
        }, 3000)
    }
}
