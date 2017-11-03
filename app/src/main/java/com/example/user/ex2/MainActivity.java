package com.example.user.ex2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    final String MY_TAG= "EX2.MainActivity";
    private int cnt=0;

    public void ButtonClicked(View v)
    {

        EditText edName =(EditText)findViewById(R.id.etEnter);
        if(edName.getText().length()==0){
            Toast.makeText(this, "Text must be inputed", Toast.LENGTH_SHORT).show();
        }
        else{
            cnt++;
            Toast.makeText(this, edName.getText()+ " this button was clicked: " +cnt+ " times", Toast.LENGTH_SHORT).show();
        }


    };



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "On Start Event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "On Resume Event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "On Pause Event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "On Stop Event");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "On Destroy Event");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, "On Create Event");
        Toast.makeText(this, "Wellcome", Toast.LENGTH_SHORT).show();
    }
}
