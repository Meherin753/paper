package com.example.paper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b24 = findViewById(R.id.button);
        Button bpt = findViewById(R.id.button2);
       final WebView web = findViewById(R.id.webview);

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://www.bd-pratidin.com/");

            }
        });

        bpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                web.loadUrl("http://bdnews24.com/");

            }
        });
    }
}