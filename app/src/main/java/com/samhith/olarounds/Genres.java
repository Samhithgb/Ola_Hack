package com.samhith.olarounds;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Genres extends ActionBarActivity {

    int var=0;
    //private PendingIntent pendingIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres);
       final Button allbang = (Button) findViewById(R.id.allbang);
        final Button food = (Button) findViewById(R.id.foodlov);
        final Button nerd = (Button) findViewById(R.id.nerdsday);
        final Button devotee = (Button) findViewById(R.id.devotee);
       // final Button custom = (Button) findViewById(R.id.custom);

        allbang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = 1;

                Intent intent = new Intent(Genres.this, PlaceList.class);
                intent.putExtra("extra_text", Integer.toString(var));
                startActivity(intent);
            }
        });

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = 2;
                Intent intent = new Intent(Genres.this, PlaceList.class);
                intent.putExtra("extra_text", Integer.toString(var));
                startActivity(intent);
            }
        });

        nerd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = 3;
                Intent intent = new Intent(Genres.this, PlaceList.class);
                intent.putExtra("extra_text", Integer.toString(var));
                startActivity(intent);
            }
        });

        devotee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = 4;
                Intent intent = new Intent(Genres.this, PlaceList.class);
                intent.putExtra("extra_text", Integer.toString(var));

                startActivity(intent);
            }
        });

    /*    custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var = 1;
            }
        });

        View.OnClickListener v = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.allbang:
                        var = 1;
                        break;
                    case R.id.foodlov:
                        var = 2;
                        break;
                    case R.id.nerdsday:
                        var = 3;
                        break;
                    case R.id.devotee:
                        var = 4;
                        break;
                    case R.id.custom:
                        var = 5;
                        break;
                }
*/


            }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_genres, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
