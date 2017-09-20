package com.example.rkalimul.materialdesign;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Snackbar.make(findViewById(R.id.myCoordinatorLayout),R.string.email_sent, Snackbar.LENGTH_SHORT).show();
    }
}
