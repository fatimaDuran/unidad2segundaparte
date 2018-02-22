package com.example.acer.redessociales;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonConpartir,buttonface,buttontuiter,buttonwuast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonConpartir=(Button) findViewById(R.id.buttonShare);
        buttonface=(Button) findViewById(R.id.buttonFace);
        buttonwuast=(Button)findViewById(R.id.buttonwuast);
        buttontuiter=(Button) findViewById(R.id.buttontuiter);

        buttonConpartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "el mejor de androi http://Android.aplicacion.pe/");
                startActivity(Intent.createChooser(intent,"share with"));


            }
        });

        buttonface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "el mejor de android http://Android.aplicacion.pe/");
                intent.setPackage("com.facebook.katana");
                startActivity(intent);

            }
        });

        buttonwuast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "el mejor de android http://Android.aplicacion.pe/");
                intent.setPackage("com.whatsap");
                startActivity(intent);
            }
        });
        buttontuiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "el mejor de android http://Android.aplicacion.pe/");
                intent.setPackage("com.twitter.android");
                startActivity(intent);

            }
        });
}
}
