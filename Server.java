package com.example.sidra.myapplication;

import android.util.Log;
//this is good madinaa
//this is second comment
public class Server extends Pc {

String anyproperty;
   String newVariable;

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
