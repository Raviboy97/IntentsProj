package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button add,min,mul,div;
    EditText etxt1, etxt2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        add = findViewById(R.id.add);
        min = findViewById(R.id.min);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        etxt1 = findViewById(R.id.etxt2);
        etxt2 = findViewById(R.id.etxt4);
        txt = findViewById(R.id.tvAnswer);

        Intent i = getIntent();
        final int id = getIntent().getIntExtra("v1",0);
        final  int id1 = getIntent().getIntExtra("v2",0);

        etxt1.setText(String.valueOf(id));
        etxt2.setText((String.valueOf(id1)));

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etxt1.getText().toString());
                int number2 = Integer.parseInt(etxt2.getText().toString());
                int sum = number1 + number2;
                txt.setText(+id + "+" + id1 + " = " + String.valueOf(sum));
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etxt1.getText().toString());
                int number2 = Integer.parseInt(etxt2.getText().toString());
                int min = number1 - number2;
                txt.setText(+id + "-" + id1 + " = " + String.valueOf(min));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etxt1.getText().toString());
                int number2 = Integer.parseInt(etxt2.getText().toString());
                int mul = number1 * number2;
                txt.setText(+id + "*" + id1 + " = " + String.valueOf(mul));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etxt1.getText().toString());
                int number2 = Integer.parseInt(etxt2.getText().toString());
                int div = number1 / number2;
                txt.setText(+id + "/" + id1 + " = " + String.valueOf(div));
            }
        });


    }
}
