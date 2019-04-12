package com.example.supportcast.basicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        // Get text from EditText
        EditText userEditText = (EditText)findViewById(R.id.userEditText);

        // Show log information when button is pressed
        Log.i("Info", "Button was pressed");
        Log.i("User Input", userEditText.getText().toString());

        // change image
        ImageView carImageView = (ImageView)findViewById(R.id.carImageView);
        carImageView.setImageResource(R.drawable.car2);

        // Display Toast Message
        Toast.makeText(getApplicationContext(), "Thank you for clicking me", Toast.LENGTH_LONG).show();
    }
}
