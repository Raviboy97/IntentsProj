package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText etxt1, etxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        etxt1 = findViewById(R.id.etxt1);
        etxt2 = findViewById(R.id.etxt3);
    }

    @Override
    protected void onResume() {
        super.onResume();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                int s = Integer.parseInt((etxt1.getText().toString()));
                int s1 = Integer.parseInt((etxt2.getText().toString()));

                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("v1",s);
                i.putExtra("v2",s1);
                startActivity(i);
            }
        });
    }
}
