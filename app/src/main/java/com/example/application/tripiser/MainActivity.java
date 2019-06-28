package com.example.application.tripiser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            showdate();                     //To load the date entered previously
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public void contclick(View view) throws IOException
    {
        EditText tripDate=(EditText) findViewById(R.id.tripDate);
        String trd=tripDate.getText().toString();
        if(trd.length()==10)
        {
            char td[] = trd.toCharArray();
            if (td[2] == '/' && td[5] == '/')      //If true then save date to file and go to next activity
            {
                FileOutputStream fout = openFileOutput("TripDate.txt", MODE_PRIVATE);      //Writing to file
                fout.write(trd.getBytes());
                Toast.makeText(getApplicationContext(), "Welcome...We wish you a Happy Journey...", Toast.LENGTH_LONG).show();
                fout.close();
                Intent i = new Intent(this, ToggleActivity.class);       //Starting another Activity
                startActivity(i);
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(),"The Date entered is not valid.Please follow the correct format (DD/MM/YYYY)",Toast.LENGTH_LONG).show();
        }
    }
    public void showdate() throws IOException       //To load the date entered previously
    {
        EditText tripDate=(EditText) findViewById(R.id.tripDate);
        FileInputStream fin=openFileInput("TripDate.txt");
        BufferedReader brf=new BufferedReader(new InputStreamReader(fin));
        String str=brf.readLine();
        if(str!=null)
        {
            tripDate.setText(str);
        }
    }
}
