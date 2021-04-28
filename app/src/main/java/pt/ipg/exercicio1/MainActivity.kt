package pt.ipg.exercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    companion object{
        val INFO_EXTRA_MENSAGEM = "Mensagem"
        val Data = "Data"
    }


    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMessage)
        val mensagem = editTextMensagem.text.toString()
        val data = Date()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        val intent = Intent(this, MostraMensagemActivity::class.java).apply {
            putExtra(INFO_EXTRA_MENSAGEM, mensagem)
            putExtra(Data, data)
        }

        startActivity(intent)


    }
}