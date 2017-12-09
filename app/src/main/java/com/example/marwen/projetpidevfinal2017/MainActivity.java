package com.example.marwen.projetpidevfinal2017;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends TabActivity {
    /**
     * Called when the activity is first created.
     */


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost); // initiate TabHost
        TabHost.TabSpec spec; // Reusable TabSpec for each tab
        Intent intent; // Reusable Intent for each tab

        spec = tabHost.newTabSpec("home");
        // Create a new TabSpec using tab host
        spec.setIndicator("",res.getDrawable(R.drawable.home));

        // set the “HOME” as an indicator
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent(this, HomeActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);
        ////////////////////

        spec = tabHost.newTabSpec("home");
        // Create a new TabSpec using tab host
        spec.setIndicator("",res.getDrawable(R.drawable.ic_tool_6));

        // set the “HOME” as an indicator
        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent(this, AjoutMatrielNonDispo.class);
        spec.setContent(intent);
        tabHost.addTab(spec);















        ///////////

        // Do the same for the other tabs

        spec = tabHost.newTabSpec("PROFILE");
        spec.setIndicator("",res.getDrawable(R.drawable.man));

        intent = new Intent(this, ProfileActivity.class);
        spec.setContent(intent);
        tabHost.addTab(spec);


        tabHost.setCurrentTab(1);
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                // display the name of the tab whenever a tab is changed
                Toast.makeText(getApplicationContext(), tabId, Toast.LENGTH_SHORT).show();
            }
        });


    }


}
