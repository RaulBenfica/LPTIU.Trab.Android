package br.edu.esdeva.raultrabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityResposta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        Intent it = getIntent();
        Bundle bundle = it.getExtras();

        if(bundle != null) {
            TextView resultado = (TextView) findViewById(R.id.txtResultado);
            resultado.setText(bundle.getString("Juros"));
        }

        Button btRetornar = (Button) findViewById(R.id.btRetornar);
        btRetornar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent voltar = new Intent(ActivityResposta.this, MainActivity.class);
                startActivity(voltar);
            }
        });
    }
}
