package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.codepath.apps.restclienttemplate.models.Entities;
import com.codepath.apps.restclienttemplate.models.Tweet;
import com.codepath.apps.restclienttemplate.models.Urls;
import com.codepath.apps.restclienttemplate.models.Urls2;

import org.parceler.Parcels;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DetailActivity extends AppCompatActivity {

    ImageView profilePicture;
    TextView tvBody;
    TextView tvName;
    ImageView test;
    TextView favorite_count;

    //Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00DCF8"));
        actionBar.setBackgroundDrawable(colorDrawable);

        favorite_count = findViewById(R.id.counterForFavorite);
        profilePicture = findViewById(R.id.profilePicture);
        tvBody = findViewById(R.id.tvBody);
        tvName = findViewById(R.id.tvName);
        test = findViewById(R.id.imageView3);




        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("tweet"));

        //Glide.with(this).load(tweet.user).placeholder(R.drawable.ic_launcher).into(test);

        //
        favorite_count.setText(String.valueOf(tweet.favorite));
        tvBody.setText(tweet.body);
        tvName.setText(tweet.user.ScreenName);
        Glide.with(this)
                .load(tweet.user.profileImageUrl)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(profilePicture);


            //Glide.with(this).load(tweet.entities.Media).placeholder(R.drawable.ic_launcher).into(test);
        if(tweet.entities.exists == 1){

            Glide.with(this).load(tweet.entities.Media).into(test);
        }


        //tvTest.setText(tweet.user.entities.Media);
    }
}