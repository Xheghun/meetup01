package com.example.meetup01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.widget.EditText;

import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    EditText fullName;
    EditText description;
    EditText location;
    EditText emailAddress;
    EditText phoneNumber;
    EditText twitter;
    EditText faceBook;
    Button submitData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submitData = findViewById(R.id.submitData_button);
    }

    public void submitData(View view) {

        fullName = findViewById(R.id.fullName_editText);
        String inputfullname = fullName.getText().toString();

        description = findViewById(R.id.description_editText);
        String inputDescription = description.getText().toString();

        location = findViewById(R.id.location_editText);
        String inputLocaton = location.getText().toString();

        emailAddress = findViewById(R.id.email_editText);
        String inputEmail = emailAddress.getText().toString();

        phoneNumber = findViewById(R.id.phoneNumber_editText);
        int inputPhonenumber = Integer.parseInt(phoneNumber.getText().toString());

        twitter = findViewById(R.id.twitter_editText);
        String inputTwitter = twitter.getText().toString();

        faceBook = findViewById(R.id.faceBook_editText);
        String inputFacebook = faceBook.getText().toString();

        Intent i = new Intent(this, profilepage.class);

        i.putExtra ("fullnameInput", inputfullname);
        i.putExtra ("descriptionInput", inputDescription);
        i.putExtra ("locationInput", inputLocaton);
        i.putExtra ("emailInput", inputEmail);
        i.putExtra ("phonenumberInput", inputPhonenumber);
        i.putExtra ("twitterInput", inputTwitter);
        i.putExtra ("facebookInput", inputFacebook);


        startActivity (i);
    }
}
