package com.suraj.fun;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.ArrayList;

public class FunFactsActivity extends ActionBarActivity {

    //this method is called when the is first started/created
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this is the point where the layout gets attached to the activity
        setContentView(R.layout.activity_fun_facts);
        final TextView factLabel = (TextView)findViewById(R.id.factTextView);
        Button factButton = (Button)findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String fact = "AirBnb was rejected by 12 different investors";
                factLabel.setText(getfacts());
            }
        };
        factButton.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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

    public String getfacts(){
        ArrayList<String> facts = new ArrayList<String>();
        facts.add("Peaches are members of almond family");
        facts.add("Dolphins are unable to smell");
        facts.add("Bees are born fully grown.");
        facts.add("Slugs have four noses");
        facts.add("The snail breadthes through its foot");
        facts.add("There are 28 million small businesses in the U.S,which outnumber corporations 1162 to 1");
        facts.add("70% of small businesses are owned and operated by a single person");
        facts.add("The sun is actually white but Earth's atmosphere makes it yellow appear.");
        facts.add("Small businesses employ 57% of the country's private workforce");
        facts.add("Small businesses pay 44% of U.S. payroll");
        facts.add("Computer science is the systematic study of computation with respect to computer systems and software applications. ");
        facts.add("A switch and a hub isn't the same thing.");
        facts.add("One third of small businesses rely on credit for financing");
        facts.add("It takes just 6 days to start a business in the US, compared to a whopping 38 days in China");
        facts.add("Every year over one million earthquakes shake the Earth.");
        facts.add("The 77 million people that make up the US small business workforce would rank as the 17th most populous country in the world, just ahead of Iran");
        facts.add("Only 50% of businesses survive five years -- though most (70%) hit the two-year mark");
        facts.add("Every year lightning kills 1000 people.");
        facts.add("In  October 1999 an Iceberg the size of London broke free from the Antarctic ice shelf .");
        facts.add("Northwestern states like Montana & Wyoming rely more heavily on small businesses");
        facts.add("And it costs 6x as much to start a business in India than in the US");
        int random = 0;
        random = (int) Math.floor(Math.random()*21);
        return facts.get(random);
    }
}