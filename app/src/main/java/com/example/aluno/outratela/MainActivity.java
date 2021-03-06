package com.example.aluno.outratela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnpassa = (Button) findViewById(R.id.btnpassar);
        btnpassa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
   @Override
    public void onStart(){
       super.onStart();
       Log.i("Script" , this.getClass().getName() + ".onStart()");

   }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("Script", this.getClass().getName() + ".onResume()");

    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("Script", this.getClass().getName() + ".onPause()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("Script", this.getClass().getName() + ".onStop()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("Script", this.getClass().getName() + ".onDestroy()");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("Script", this.getClass().getName() + ".onRestart");
    }

}
