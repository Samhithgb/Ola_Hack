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
import android.widget.EditText;
import android.widget.Toast;


public class BookNow extends ActionBarActivity {

    int value;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_now);
        Button booklater = (Button) findViewById(R.id.booker);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = Integer.parseInt(extras.getString("variable"));
        }
        switch (value) {
            case 1:
                s = "All Bangalore Ride";
                break;
            case 2:
                s = "Food Lovers Day";
                break;
            case 3:
                s = "Nerds Day Out";
                break;
            case 4:
                s = "Devotees Delight!";
                break;

        }
        Toast.makeText(getBaseContext(), "Your Cab is being booked for " + s, Toast.LENGTH_SHORT).show();
        booklater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText) findViewById(R.id.time);
                int i = Integer.parseInt(text.getText().toString());
                Intent intent = new Intent(BookNow.this, MyBroadcastReceiver.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(
                        BookNow.this, 234324243, intent, 0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()
                        + (i * 1000 ), pendingIntent);
                Toast.makeText(BookNow.this, "Alarm set in " + i + " seconds",Toast.LENGTH_LONG).show();
            }

        });
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book_now, menu);
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
