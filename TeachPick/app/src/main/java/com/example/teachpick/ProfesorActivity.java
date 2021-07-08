package com.example.teachpick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

public class ProfesorActivity extends AppCompatActivity {

    Comentarios[] aComentarios={
            new Comentarios("18550635", "Es buen profesor pero a veces sus exámenes son muy difíciles", (float) 8.0),
            new Comentarios("18550978", "Me gustó su clase es interesante, pero sus exámnes son demasiado para lo que te esperas", (float)6.0),
            new Comentarios("18550655", "Buen profe, lo recomiendo, aprendes muy bien con él", (float)9.0),

    };
    ListView lstVwComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //esta parte es para hacer pantalla completa, quitar las notis pero la action bar la quitas en themes
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profesor);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwComentarios=findViewById(R.id.lstVwComentarios);

        lstVwComentarios.setAdapter(new ComentariosAdaptador(this, R.layout.mi_lista_comentarios, aComentarios));
    }
}