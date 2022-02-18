package com.example.myapp;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {
    protected static final String TAG = "LIVRO";

    private int cont = 0;

    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        Log.i(TAG,"onCreate() chamado"+icicle);
    }
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"OnStart() chamado");
    }
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"OnRestart() chamado");
    }
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"OnResume() chamado");
    }
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause() chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState() chamado");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onSaveInstanceState() chamado");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy() chamado");
    }






}
