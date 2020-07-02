package br.edu.esdeva.raultrabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSimples = (Button) findViewById(R.id.btSimples);
        Button btComposto = (Button) findViewById(R.id.btComposto);
        Button btDescontoSimples = (Button) findViewById(R.id.btDescontoSimples);


        btSimples.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivitySimples.class);
                startActivity(it);
            }
        });

        btComposto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivityComposto.class);
                startActivity(it);
            }
        });

        btDescontoSimples.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, ActivityDescontoSimples.class);
                startActivity(it);
            }
        });

    }

}
