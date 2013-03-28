package com.oddjobs2;

import sofia.app.Screen;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class StartActivity
    extends Screen
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.startactivity, menu);
        return true;
    }

}
