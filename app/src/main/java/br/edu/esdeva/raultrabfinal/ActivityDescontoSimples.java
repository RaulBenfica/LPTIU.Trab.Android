package br.edu.esdeva.raultrabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityDescontoSimples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desconto_simples);

        Button btCalcularDesconto = (Button) findViewById(R.id.btCalcularDesconto);
        btCalcularDesconto.setOnClickListener(calcularDesconto );
    }

    private View.OnClickListener calcularDesconto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent it = new Intent(ActivityDescontoSimples.this, ActivityResposta.class);

            EditText nValorDescontoSimples = (EditText) findViewById(R.id.nValorDescontoSimples);
            EditText nTaxaDescontoSimples = (EditText) findViewById(R.id.nTaxaDescontoSimples);
            EditText nTempoDescontoSimples = (EditText) findViewById(R.id.nTempoDescontoSimples);

            Double campoCapital = Double.parseDouble(nValorDescontoSimples.getText().toString());
            Double campoTaxa = Double.parseDouble(nTaxaDescontoSimples.getText().toString());
            Double campoTempo = Double.parseDouble(nTempoDescontoSimples.getText().toString());
            campoCapital = campoCapital*(campoTaxa/100)*campoTempo;;

            Bundle bunbleDesconto = new Bundle();
            bunbleDesconto.putString("Juros", String.valueOf(campoCapital));
            it.putExtras(bunbleDesconto);

            startActivity(it);

        }

    };

}
