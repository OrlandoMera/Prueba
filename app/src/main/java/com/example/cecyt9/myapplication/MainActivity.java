package com.example.cecyt9.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import android.view.View.OnHoverListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = (Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.button){
            TextView texto = (TextView)findViewById(R.id.texto);

            texto.setText("Aiuda");
        }
    }


}
