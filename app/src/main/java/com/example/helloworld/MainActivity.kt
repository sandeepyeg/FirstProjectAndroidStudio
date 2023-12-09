package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.helloworld.R.id.textViewofValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textValue:TextView = findViewById(R.id.textViewofValue);
        val textEditView:EditText = findViewById(R.id.editTextValue);
        val buttonToChangeValue:Button = findViewById(R.id.buttonValueChange);

        buttonToChangeValue.setOnClickListener({

            val textGiven:String = textEditView.text.toString();
            textValue.setText(textGiven);

        });





    }
}