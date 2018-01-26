package com.example.didact.ejercicioboton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPlay, tvJuego, tvCompartir, tvAviso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPlay  = (TextView)findViewById(R.id.tvPlay);
        tvJuego  = (TextView)findViewById(R.id.tvJuego);
        tvCompartir  = (TextView)findViewById(R.id.tvCompartir);
        tvAviso  = (TextView)findViewById(R.id.tvAviso);



    }


    public void onClickPlay(View view) {
        tvPlay.setText("Has pulsado play");
    }
    public void onClickJuego (View view) {
        tvJuego.setText("Has pulsado el boton juego");
    }
    public void onClickCompartir (View view) {
        tvCompartir.setText("Has pulsado el boton share");
    }
    public void onClickAviso (View view) {
        tvAviso.setText("Has pulsado el boton aviso");
    }
    public void onClickBorrar (View view) {
        tvPlay.setText("");
        tvJuego.setText("");
        tvCompartir.setText("");
        tvAviso.setText("");
    }

}
