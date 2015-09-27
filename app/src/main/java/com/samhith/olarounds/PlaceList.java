package com.samhith.olarounds;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class PlaceList extends ActionBarActivity {


    String s1, s2, s3, s4, s5, s6;
int var;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_list);
        Button b = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.now);
        Bundle extras = getIntent().getExtras();

         var = Integer.parseInt(extras.getString("extra_text"));


        switch (var) {

            case 1:
                b.setText("Lalbagh");
                s1 = "https://en.m.wikipedia.org/wiki/Lal_Bagh";
                b2.setText("Bull Temple");
                s2 = "https://en.m.wikipedia.org/wiki/Dodda_Ganeshana_Gudi";
                b3.setText("Vishweshwaraiah Museum");
                s3 = "https://en.m.wikipedia.org/wiki/Visvesvaraya_Industrial_and_Technological_Museum";
                b4.setText("Vidhana Soudha");
                s4 = "https://en.m.wikipedia.org/wiki/Vidhana_Soudha";
                b5.setText("Karnataka High Court");
                s5 = "https://en.m.wikipedia.org/wiki/Karnataka_High_Court";
                b6.setText("Cubbon Park");
                s6 = "https://en.m.wikipedia.org/wiki/Cubbon_Park";
                break;

            case 2:
                b.setText("Vidyarthi Bhavan");
                s1 = "https://en.m.wikipedia.org/wiki/Vidyarthi_Bhavan";
                b2.setText("Brahmins Coffee Bar");
                s2 = "https://www.zomato.com/bangalore/brahmins-coffee-bar-basavanagudi";
                b3.setText("MTR");
                s3 = "https://en.m.wikipedia.org/wiki/Mavalli_Tiffin_Room";
                b4.setText("Veena Stores");
                s4 = "https://www.zomato.com/bangalore/veena-stores-malleshwaram";
                b5.setText("Corner House");
                s5 = "https://www.zomato.com/bangalore/corner-house-ice-cream-lavelle-road";
                b6.setText("Truffles");
                s6 = "https://www.zomato.com/bangalore/truffles-koramangala";
                break;

            case 4:
                b.setText("Iskcon");
                s1 = "https://en.m.wikipedia.org/wiki/ISKCON_Temple_Bangalore";
                b2.setText("Bull Temple");
                s2 = "https://en.m.wikipedia.org/wiki/Dodda_Ganeshana_Gudi";
                b3.setText("Ranganatha Swamy Temple");
                s3 = "https://en.m.wikipedia.org/wiki/Ranganathaswamy_Temple,_Bangalore";
                b4.setText("Gavi Gangadhareshwara Temple");
                s4 = "https://en.m.wikipedia.org/wiki/Gavi_Gangadhareshwara_Temple";
                b5.setText("Halasuru Someshwara");
                s5 = "https://en.m.wikipedia.org/wiki/Halasuru_Someshwara_Temple,_Bangalore";
                b6.setText("Kote Someshwara Temple");
                s6 = "https://en.m.wikipedia.org/wiki/Kote_Venkataramana_Temple,_Bangalore";
                break;
            case 3:
                b.setText("Government Museum");
                s1 = "https://en.m.wikipedia.org/wiki/Government_Museum_%28Bangalore%29";
                b2.setText("Nehru Planetarium");
                s2 = "https://en.m.wikipedia.org/wiki/Nehru_Planetarium";
                b3.setText("Vishweshwaraiah Museum");
                s3 = "https://en.m.wikipedia.org/wiki/Visvesvaraya_Industrial_and_Technological_Museum";
                b4.setText("HAL Museum");
                s4 = "https://en.m.wikipedia.org/wiki/HAL_Aerospace_Museum";
                b5.setText("National Gallery of Modern Art");
                s5 = "https://en.m.wikipedia.org/wiki/National_Gallery_of_Modern_Art,_Bangalore";
                b6.setText("Karnataka Chitrakala Parishat");
                s6 = "https://en.m.wikipedia.org/wiki/Karnataka_Chitrakala_Parishath";
                break;
        }

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), BookNow.class);
                intent.putExtra("variable", Integer.toString(var));
                startActivity(intent);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), webView.class);
                i.putExtra("new_variable_name", s1);
                i.putExtra("variable",Integer.toString(var));
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), webView.class);
                i2.putExtra("variable",Integer.toString(var));

                i2.putExtra("new_variable_name", s2);
                startActivity(i2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(getApplicationContext(), webView.class);
                i3.putExtra("new_variable_name", s3);
                i3.putExtra("variable",Integer.toString(var));

                startActivity(i3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(getApplicationContext(), webView.class);
                i4.putExtra("new_variable_name", s4);
                i4.putExtra("variable",Integer.toString(var));

                startActivity(i4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(getApplicationContext(), webView.class);
                i5.putExtra("new_variable_name", s5);
                i5.putExtra("variable",Integer.toString(var));

                startActivity(i5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(getApplicationContext(), webView.class);
                i6.putExtra("new_variable_name", s6);
                i6.putExtra("variable",Integer.toString(var));
                startActivity(i6);

            }
        });
    /*    new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"Entered!", Toast.LENGTH_LONG).show();
                switch (v.getId())
                {
                    case R.id.button:


                        break;
                    case R.id.button2:

                        break;
                    case R.id.button3:

                        break;
                    case R.id.button4:

                        break;
                    case R.id.button5:

                        break;
                    case R.id.button6:

                }
            }*/

    }
            @Override
            public boolean onCreateOptionsMenu (Menu menu){
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_place_list, menu);
                return true;
            }

            @Override
            public boolean onOptionsItemSelected (MenuItem item){
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
