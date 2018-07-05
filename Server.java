package com.example.sidra.myapplication;

import android.util.Log;

public class Server extends Pc {

String anyproperty;

   public Server()
   {
       anyproperty="defaultValue";
   }
    public Server(String parameter)
    {
        anyproperty=parameter;
    }

    public void functionality( String function)
    {
        Log.d("functionality", "functionality1Overrided: " );
    }



}
