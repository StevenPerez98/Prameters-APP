package com.example.parameters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt2 = (Button)findViewById(R.id.btn_2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                STVF9();
            }
        });

    }

    public void STVF9(){
        Intent stvf9 = new Intent(this, STVF9.class);
        startActivity(stvf9);
    }
}
