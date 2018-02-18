package com.example.dimas.dimaskomara_1202154210_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Dimas Komara Ramadhani Riyanto_1202154210",Toast.LENGTH_LONG).show();
    }

    public void PesanSekarang(View view) {
        if (((RadioButton)findViewById(R.id.rbt_DineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);   //proses ini akan memindahkan halaman ke dinein
            startActivity(intent); //ini adalah radio button nya dine in
        }else if (((RadioButton)findViewById(R.id.rbt_TakeAway)).isChecked()){    //proses ini jika diklik take away akan menuju activity take away
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent); //ini merupakan radio button untuk Take away
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }

    }

    public void onclickRadiobutton(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbt_TakeAway:
                if (checked)
                    displayToast(getString(R.string.take_away));
                break;
            case R.id.rbt_DineIn:
                if (checked)
                    displayToast(getString(R.string.dine_in));
                break;
        }

    }

    private void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
