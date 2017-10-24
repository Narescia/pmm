package com.example.anaval.radiocolores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView lblMensaje = (TextView) findViewById(R.id.LblSeleccion);

        final RadioGroup rg = (RadioGroup) findViewById(R.id.gruporb);
        final Button azul = (Button)findViewById(R.id.azul);
        rg.clearCheck();

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                String textoOpcion="";

                if( group.getCheckedRadioButtonId()==R.id.blanco)
                    textoOpcion +="OPCION 1 con ID:" + checkedId;
                if( group.getCheckedRadioButtonId()==R.id.rojo)
                    textoOpcion +="OPCION 2 con ID:" + checkedId ;
                if( group.getCheckedRadioButtonId()==R.id.azul)
                    azul.setOnClickListener() {
                    azul.setBackgroundColor(Color.BLUE);
                    }
                lblMensaje.setText(textoOpcion);
            }
        });
    }
}
