package com.example.android.helloandroid;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting actionbar background image
        Drawable d = getResources().getDrawable(R.drawable.justgradient);
        getSupportActionBar().setBackgroundDrawable(d);

        //Setting an OnclickListener on phone_view
        View phoneView = findViewById(R.id.phone_view);
        phoneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri telUri = Uri.parse("tel:" + getResources().getString(R.string.phone));
                Intent callingIntent = new Intent(Intent.ACTION_DIAL);
                callingIntent.setData(telUri);
                startActivity(callingIntent);
            }
        });
    }
}
