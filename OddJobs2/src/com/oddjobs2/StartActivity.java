package com.oddjobs2;

import android.widget.EditText;

import sofia.app.Screen;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
/**
 * // -------------------------------------------------------------------------
/**
 *  Log in screen for the app
 *
 *  @author Daniel
 *  @version Mar 31, 2013
 */
public class StartActivity
    extends Screen
{

    //fields for widgets on the screen
    private EditText userName;
    private EditText password;

    //fields to store user name and password
    private String pass;
    private String user;

    /**
     * sign in the user when the sign in button is clicked
     */
    public void signInClicked()
    {
        //sign in user
        presentScreen(MapScreen.class, null);


        //connect to database
    }


    /**
     * Retrieve the user name from the userName editText widget
     */
    public void userNameEditingDone()
    {
        user = userName.getText().toString();
    }

    /**
     * Retrieve the password from the password editText widget
     */
    public void passwordEditingDone()
    {
        pass = password.getText().toString();
    }



}
