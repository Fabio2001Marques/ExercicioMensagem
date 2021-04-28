package pt.ipg.exercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MostraMensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem)

        val mensagem = intent.getStringExtra(MainActivity.INFO_EXTRA_MENSAGEM)
        val data = intent.getSerializableExtra(MainActivity.Data) as Date


        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)
        textViewMensagem.setText(mensagem)

        // Mostrar a data
        val textViewHora = findViewById<TextView>(R.id.textViewHora)
        val df = SimpleDateFormat("HH:mm:ss")
        textViewHora.setText(df.format(data))



    }
}