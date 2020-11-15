package br.com.unipac.certisign_certificados;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.unipac.certisign_certificados.View.Cadastro;
import br.com.unipac.certisign_certificados.View.Camera;


public class MainActivity extends AppCompatActivity {

    Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}