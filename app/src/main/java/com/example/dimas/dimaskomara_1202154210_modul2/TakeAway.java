package com.example.dimas.dimaskomara_1202154210_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void PILIHPESANAN(View view) {
        Intent intent = new Intent(this, Menu.class); //proses ini akan diklik agar bisa lanjut ke menu
        startActivity(intent);

    }
}
