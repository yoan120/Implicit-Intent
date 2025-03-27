package com.yoan.implicitintent;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import android.content.ComponentName;
import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tampilTelepon(View view) {
        Intent teleponIntent = new Intent(Intent.ACTION_DIAL);
        startActivity(teleponIntent);
    }

    public void tampilSms(View view) {
        Intent smsIntent = new Intent(Intent.ACTION_MAIN);
        smsIntent.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(smsIntent);
    }

    public void tampilKalender(View view) {
        Intent kalenderIntent = new Intent(Intent.ACTION_MAIN);
        kalenderIntent.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(kalenderIntent);
    }

    public void tampilBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(browserIntent);
    }

    public void tampilKalkulator(View view) {
        try {
            Intent kalkulatorIntent = new Intent(Intent.ACTION_MAIN);
            kalkulatorIntent.addCategory(Intent.CATEGORY_LAUNCHER);
            kalkulatorIntent.setComponent(new ComponentName(
                    "com.android.calculator2",
                    "com.android.calculator2.Calculator"
            ));
            startActivity(kalkulatorIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "Aplikasi Kalkulator tidak ditemukan", Toast.LENGTH_SHORT).show();
        }
    }

    public void tampilKontak(View view) {
        Intent kontakIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/"));
        startActivity(kontakIntent);
    }

    public void tampilGaleri(View view) {
        Intent galeriIntent = new Intent(Intent.ACTION_VIEW);
        galeriIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivity(galeriIntent);
    }

    public void tampilWifi(View view) {
        Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(wifiIntent);
    }

    public void tampilSound(View view) {
        Intent soundIntent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivity(soundIntent);
    }

    public void tampilAirplane(View view) {
        Intent airplaneIntent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(airplaneIntent);
    }

    public void tampilAplikasi(View view) {
        Intent aplikasiIntent = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivity(aplikasiIntent);
    }

    public void tampilBluetooth(View view) {
        Intent bluetoothIntent = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(bluetoothIntent);
    }
}

