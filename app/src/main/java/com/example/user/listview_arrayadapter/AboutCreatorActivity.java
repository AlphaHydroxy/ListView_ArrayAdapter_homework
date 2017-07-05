package com.example.user.listview_arrayadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutCreatorActivity extends AppCompatActivity {

    TextView aboutCreator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_creator);

        aboutCreator = (TextView)findViewById(R.id.aboutcreator);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String about = extras.getString("aboutcreator");
        aboutCreator.setText(about);
    }



}
