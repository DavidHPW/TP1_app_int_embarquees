package com.example.tp1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eT_1;
    EditText eT_2;
    Button  button_get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eT_1 = findViewById(R.id.editText_1);
        eT_2 = findViewById(R.id.editText_2);

    }

    public void start(View view) {
        String text_1 = eT_1.getText().toString().trim();
        String text_2 = eT_2.getText().toString().trim();
        Toast.makeText(this, "Message " + text_1 + " " + text_2, Toast.LENGTH_SHORT ).show();
    }
}