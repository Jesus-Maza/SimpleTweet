package com.codepath.apps.restclienttemplate.models;

import androidx.room.Embedded;

import java.util.ArrayList;
import java.util.List;

public class TweetwithUser {
    @Embedded
    User user;

    @Embedded(prefix = "tweet_")
    Tweet tweet;

    public static List<Tweet> getTweetList(List<TweetwithUser> tweetWithUserList) {
        List<Tweet> tweets = new ArrayList<>();
        for(int i = 0; i < tweetWithUserList.size(); i++){
            Tweet tweet = tweetWithUserList.get(i).tweet;
            tweet.user = tweetWithUserList.get(i).user;
            tweets.add(tweet);
        }
        return tweets;
    }
}
