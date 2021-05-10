package edu.ib.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ReceiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receive2)

        val message=intent.getStringExtra(EXTRA_MESSAGE)

        val textView=findViewById<TextView>(R.id.tvMessage).apply{
            text=message
        }




    }
}