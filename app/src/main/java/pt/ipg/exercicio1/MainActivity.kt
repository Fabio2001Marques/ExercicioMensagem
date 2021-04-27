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
        val HORA = "hora"
    }


    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMessage)
        val mensagem = editTextMensagem.text.toString()
        val hora = "Hora: "+Calendar.getInstance().get(Calendar.HOUR_OF_DAY).toString()+":"+Calendar.getInstance().get(Calendar.MINUTE).toString()+ ":" + Calendar.getInstance().get(Calendar.SECOND).toString()+ " Data: "+Calendar.getInstance().get(Calendar.DATE).toString()+"/"+Calendar.getInstance().get(Calendar.MONTH).toString()+ "/" + Calendar.getInstance().get(Calendar.YEAR).toString()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return
        }

        val intent = Intent(this, MostraMensagemActivity::class.java)
        intent.putExtra(INFO_EXTRA_MENSAGEM, mensagem)
        intent.putExtra(HORA, hora)
        startActivity(intent)


    }
}