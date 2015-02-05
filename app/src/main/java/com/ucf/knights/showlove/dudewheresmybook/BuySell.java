package com.ucf.knights.showlove.dudewheresmybook;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
//My Imports
import android.view.View.OnClickListener;


public class BuySell extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);

        LinearLayout bsLayout = (LinearLayout) findViewById( R.id.bsLLayout );
        Button bsBUY = ( Button ) findViewById( R.id.BUY );
        Button bsSELL = ( Button ) findViewById( R.id.SELL );

        bsBUY.setOnClickListener( new handleButton() );

/*
        //When BUY button is pressed go to the Buy screen
        bsBUY.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startNextClassBuy = new Intent(BuySell.this, Buy.class);
                BuySell.this.startActivity( startNextClassBuy );
            }
        }); */
    }

    class handleButton implements OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(BuySell.this, Buy.class);
            startActivity(intent);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buy_sell, menu);
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
