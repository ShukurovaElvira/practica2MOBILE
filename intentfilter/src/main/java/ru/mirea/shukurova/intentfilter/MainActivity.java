package ru.mirea.shukurova.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Uri address = Uri.parse("https://www.mirea.ru/");
    Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(openLinkIntent);
        } else {
            Log.d("Intent", "Не получается обработать намерение!");

            setContentView(R.layout.activity_main);
        }
    }
}