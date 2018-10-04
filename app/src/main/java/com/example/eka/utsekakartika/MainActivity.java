package com.example.eka.utsekakartika;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Login berhasil, Selamat datang.", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nasi_goreng:
                Toast.makeText(this, "Makanan Nasi Goreng." ,Toast.LENGTH_SHORT).show();
                break;
            case R.id.ayam_goreng:
                Toast.makeText(this, "Makanan Ayam Goreng." ,Toast.LENGTH_SHORT).show();

                break;
            case R.id.bakso:
                Toast.makeText(this, "Makanan Bakso." ,Toast.LENGTH_SHORT).show();

                break;
            case R.id.sate:
                Toast.makeText(this, "Makanan Sate." ,Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
