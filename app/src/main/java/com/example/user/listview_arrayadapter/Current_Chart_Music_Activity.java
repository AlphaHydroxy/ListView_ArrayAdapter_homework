package com.example.user.listview_arrayadapter;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Current_Chart_Music_Activity extends AppCompatActivity implements View.OnClickListener{

//    link from menu?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current__chart__music_);
        UKChart ukchart = new UKChart();
        ArrayList<Song> list = ukchart.getList();

        UKChartAdapter chartAdapter = new UKChartAdapter(this, list);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(chartAdapter);

//        declare link tie up to id
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_hello) {
            Toast.makeText(this, R.string.menu_toast_hello, Toast.LENGTH_LONG).show();
            return true;
        }
        if (item.getItemId() == R.id.click_me) {
            Toast.makeText(this, R.string.toast_is_toast, Toast.LENGTH_LONG).show();
            return true;
        }
        if (item.getItemId() == R.id.action_login){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void getSong(View listItem){
        Song song = (Song)listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked: ");
        sb.append(song.getTitle());
//        Toast.makeText(this, sb.toString(), Toast.LENGTH_LONG).show();

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
        snackbar.setAction("Say hello", this);
        snackbar.show();
}

    @Override
    public void onClick(View v){
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
    }

//    @Override
//    public void onClickAbout(View about){
//        Intent intent = new Intent(this, AboutCreatorActivity.class);
//        intent.putExtra("aboutcreator", something.aboutCreator());
//        startActivity(intent);
//
//    }
}
