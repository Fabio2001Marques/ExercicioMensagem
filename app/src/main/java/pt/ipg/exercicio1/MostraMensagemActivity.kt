package pt.ipg.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val hora = intent.getStringExtra(MainActivity.HORA)


        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.setText(mensagem)

        val textViewHora = findViewById<TextView>(R.id.textViewHora)
        textViewHora.setText(hora)


    }
}