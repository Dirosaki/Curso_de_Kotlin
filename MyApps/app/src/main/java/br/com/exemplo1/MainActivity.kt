
package br.com.exemplo1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Colocando uma função para quando o botão
        btnComprimentar.setOnClickListener {

            var texto1 = txvOla.text
            if (txvOla.text != "Olá Android!") {
                txvOla.text = "Olá Android!"
            }
            else if(txvOla.text == "Olá Android!"){
                txvOla.text = "Bem Vindo ao Android"
            }
        }
    }
}
