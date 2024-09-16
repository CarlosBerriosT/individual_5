package com.example.hellotoast;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonToast = findViewById(R.id.buttonToast);
        Button buttonCounter = findViewById(R.id.buttonCounter);
        TextView textViewCounter = findViewById(R.id.textViewCounter);


        buttonToast.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "¡Hola!", Toast.LENGTH_SHORT).show()
        );


        buttonCounter.setOnClickListener(v -> {
            clickCount++;
            textViewCounter.setText("Contador: " + clickCount);
        });
    }
}
