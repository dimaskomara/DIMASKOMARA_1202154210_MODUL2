package com.example.dimas.dimaskomara_1202154210_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DineIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
    }

    public void PILIHPESANAN(View view) {
        EditText editText = (EditText) findViewById(R.id.editText5);
        if (editText!= null){
            String showString = editText.getText().toString();
            Toast.makeText(this, showString,Toast.LENGTH_LONG).show();//langkah ini dapat menghasilkan pesan saat diklik
            Intent intent = new Intent(this, Menu.class);
            startActivity(intent);
        }
    }
}
