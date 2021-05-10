package edu.ib.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE="edu.ib.intentdemo.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSendMessage(view: View) {
        val ediText=findViewById<EditText>(R.id.edtMessage)
        val message=ediText.text.toString()

        val intent= Intent(this,ReceiveActivity::class.java ).
                apply{
                    putExtra(EXTRA_MESSAGE,message)
                }
        startActivity(intent)
    }


}