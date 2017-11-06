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
            Toast.makeText(this, getString(R.string.error), Toast.LENGTH_SHORT).show();
        }
        else{
            cnt++;
            Toast.makeText(this, edName.getText()+ " "+getString(R.string.click) +cnt, Toast.LENGTH_SHORT).show();
        }


    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(MY_TAG,getString(R.string.restart));
        outState.putInt("conuter",this.cnt);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            this.cnt = savedInstanceState.getInt("conter");
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, getString(R.string.A_onResume));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, getString(R.string.A_onCreate));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, getString(R.string.A_onPause));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG,getString(R.string.A_onStop));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, getString(R.string.A_onDestroy));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG, getString(R.string.A_onCreate));

    }
}
