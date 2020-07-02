package br.edu.esdeva.raultrabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class ActivitySimples extends AppCompatActivity {
    public static final int CONSTANT_tELA1 = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simples);

        Button btCalcularSimples = (Button) findViewById(R.id.btCalcularSimples);
        btCalcularSimples.setOnClickListener(calcularSimples);

    }

    private View.OnClickListener calcularSimples = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent it = new Intent(ActivitySimples.this, ActivityResposta.class);

            EditText nValor = (EditText) findViewById(R.id.nValor);
            EditText nTaxa = (EditText) findViewById(R.id.nTaxa);
            EditText nTempo = (EditText) findViewById(R.id.nTempo);

            Double campoCapital = Double.parseDouble(nValor.getText().toString());
            Double campoTaxa = Double.parseDouble(nTaxa.getText().toString());
            Double campoTempo = Double.parseDouble(nTempo.getText().toString());
            campoCapital = campoCapital*(campoTaxa/100)*campoTempo;

            Bundle bunbleSimples = new Bundle();
            bunbleSimples .putString("Juros", String.valueOf(campoCapital));
            it.putExtras(bunbleSimples);

            startActivity(it);

        }
    };
}
