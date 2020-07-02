package br.edu.esdeva.raultrabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityComposto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composto);

        Button btCalcularComposto = (Button) findViewById(R.id.btCalcularComposto);
        btCalcularComposto.setOnClickListener(calcularComposto);

    }

    private View.OnClickListener calcularComposto = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent it = new Intent(ActivityComposto.this, ActivityResposta.class);

            EditText nValorComposto = (EditText) findViewById(R.id.nValorComposto );
            EditText nTaxaComposto  = (EditText) findViewById(R.id.nTaxaComposto );
            EditText nTempoComposto  = (EditText) findViewById(R.id.nTempoComposto );

            Double campoCapital = Double.parseDouble(nValorComposto .getText().toString());
            Double campoTaxa = Double.parseDouble(nTaxaComposto .getText().toString());
            Double campoTempo = Double.parseDouble(nTempoComposto .getText().toString());
            campoCapital = campoCapital*Math.pow((1+ campoTaxa/100), campoTempo);

            Bundle bunbleComposto = new Bundle();
            bunbleComposto.putString("Juros", String.valueOf(campoCapital));
            it.putExtras(bunbleComposto);

            startActivity(it);

        }
    };
}
