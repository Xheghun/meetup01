package com.example.meetup01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class profilepage extends AppCompatActivity {

    TextView fullname;
    TextView description;
    TextView location;
    TextView emailAddress;
    TextView phoneNumber;
    TextView twitter;
    TextView facebook;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilepage);

        Bundle bundle = getIntent().getExtras();

        String fullnameView = bundle.getString("fullnameInput");
        fullname = findViewById(R.id.fullName_textView);
        fullname.setText(fullnameView);

        String descriptionView = bundle.getString("descriptionInput");
        description = findViewById(R.id.description_textView);
        description.setText(descriptionView);

        String locationView = bundle.getString("locationInput");
        location = findViewById(R.id.location_textView);
        location.setText(locationView);

        String emailView = bundle.getString("emailInput");
        emailAddress = findViewById(R.id.email_textView);
        emailAddress.setText(emailView);

        String phoneNumberView = bundle.getString("phonenumberInput");
        phoneNumber = findViewById(R.id.phoneNumber_textView);
        phoneNumber.setText(phoneNumberView);

        String twitterView =bundle.getString("twitterInput");
        twitter = findViewById(R.id.twitter_textView);
        twitter.setText(twitterView);

        String facebookView = bundle.getString("facebookInput");
        facebook = findViewById(R.id.faceBook_textView);
        facebook.setText(facebookView);

    }
}
