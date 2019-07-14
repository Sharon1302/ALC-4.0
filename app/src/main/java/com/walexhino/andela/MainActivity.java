package com.walexhino.andela;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OpenAndelaLink(View view) {

               Intent intent= new Intent(this, About_ALC.class);
        startActivity(intent);



    }

    public void OpenProfile(View view) {


        Intent intent= new Intent(this, My_Profile.class);
        startActivity(intent);

    }



}
