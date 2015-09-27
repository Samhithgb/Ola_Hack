package com.samhith.olarounds;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;


public class OlaRounds extends Activity {


String s1,s2;
    int x=0,y=0;
    // Enable Local Datastore.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_rounds);
        final EditText login= (EditText) findViewById(R.id.login_id);
        final EditText password= (EditText) findViewById(R.id.pass);
        Button go=(Button)findViewById(R.id.but1);
        Button sign=(Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=1;
                login.setText("");
            }
        });

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
y=1;
                password.setText("");
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(OlaRounds.this, "Entered GO!", Toast.LENGTH_SHORT).show();
               s1 = login.getText().toString();
                if(s1.equals("")||x==0)
                    login.setError("Enter your login id!");

                s2 = password.getText().toString();
                if(s2.equals("")||y==0)
                    password.setError("Enter your password!");


                    SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);

                    String name = sharedPref.getString("username", "");

                    String pwd = sharedPref.getString("password", "");
                    if (name.equals(s1) && pwd.equals(s2)) {
                        Toast.makeText(OlaRounds.this, "login success", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getBaseContext(), Genres.class);
                        startActivity(intent);



                    } else {
                        Toast.makeText(OlaRounds.this, "login unsuccesfully", Toast.LENGTH_LONG).show();
                    }

                }

            });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OlaRounds.this,Sign_up.class);
                startActivity(intent);
            }
        });


        }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ola_rounds, menu);
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
