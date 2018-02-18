package com.example.dimas.dimaskomara_1202154210_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void NASKUN(View view) {
        Intent i = new Intent(Menu.this, DetailMenu.class);  //jika diklik gambar nasi kuning maka bisa lanjut ke activity detailmenu
        startActivity(i);
    }
}
