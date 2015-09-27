package com.samhith.olarounds;

import android.content.Context;
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


public class Sign_up extends ActionBarActivity {

    String name, password1, password2, ph, email;
    int filname = 0, filpass = 0, filph = 0, filem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText n = (EditText) findViewById(R.id.name);
        final EditText pass1 = (EditText) findViewById(R.id.pass1);
        final EditText pass2 = (EditText) findViewById(R.id.password);
        final EditText phone = (EditText) findViewById(R.id.phone);
        final EditText ema = (EditText) findViewById(R.id.editText2);
        Button done = (Button) findViewById(R.id.done);
        Button back = (Button) findViewById(R.id.button2);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = n.getText().toString();
                password1 = pass1.getText().toString();
                password2 = pass2.getText().toString();
                ph = phone.getText().toString();
                email = ema.getText().toString();

                if (!(password1.equals(password2))) {
                    pass2.setError("Passwords don't match!");
                }

                if ((filem == 0) || (filph == 0) || (filpass == 0) || (filname == 0) || name.equals("") || password1.equals("") || password2.equals("") || ph.equals("") || email.equals("")) {
                    n.setError("Required fields missing!!");
                }


                    SharedPreferences sharedPref = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor =sharedPref.edit();

                    editor.putString("username", name);
                    editor.putString("password",password1);
                    editor.putString("phone-no",ph);
                    editor.putString("email",email);
                    editor.apply();

                    Toast.makeText(Sign_up.this,"Saved", Toast.LENGTH_LONG).show();



            }


        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(Sign_up.this, OlaRounds.class);
                    startActivity(intent);


                            }
        });


        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filname = 1;
                n.setText("");
            }
        });

        pass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass1.setText("");
                filpass = 1;
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filph = 1;
                phone.setText("");
            }
        });

        ema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filem = 1;
                ema.setText("");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_up, menu);
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
