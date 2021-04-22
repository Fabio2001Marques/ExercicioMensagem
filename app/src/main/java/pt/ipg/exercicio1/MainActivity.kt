package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMessage)

        val mensagem = editTextMensagem.text.toString()

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra("Mensagem", mensagem)

        startActivity(intent)
    }
}