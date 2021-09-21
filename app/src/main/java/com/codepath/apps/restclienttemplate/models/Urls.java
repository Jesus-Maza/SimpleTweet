package com.codepath.apps.restclienttemplate.models;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class Urls {

    public Urls2  urls2;
    public List<String> media_url;
    public String Media_Url;
    public Urls(){}

    public static Urls fromJson(JSONArray jsonArray) throws JSONException{

        Urls urls = new Urls();
        /*JSONArray mJsonArray = new JSONArray(jsonArray);
        JSONObject mJsonObject = mJsonArray.getJSONObject(0);

        urls.Media_Url = mJsonObject.getString("media_url_https");*/
        return urls;
        }


}

/*json.JSONException: Value {"hashtags":[{"text":"AcademyMuseumGala","indices":[19,37]}],"symbols":[],
"user_mentions":[],"urls":[],"media":[{"id":1441929903230922752,"id_str":"1441929903230922752",
"indices":[38,61],"media_url":"http:\/\/pbs.twimg.com\/media\/FALDm3kXsAAOkN4.jpg",
"media_url_https":"https:\/\/pbs.twimg.com\/media\/FALDm3kXsAAOkN4.jpg",
"url":"https:\/\/t.co\/0PsgJNghgz","display_url":"pic.twitter.com\/0PsgJNghgz",
"expanded_url":"https:\/\/twitter.com\/EugenioDerbez\/status\/1441929945979269122\/photo\/1",
"type":"photo","sizes":{"small":{"w":544,"h":680,"resize":"fit"},"thumb":{"w":150,"h":150,"resize":"crop"},
"medium":{"w":960,"h":1200,"resize":"fit"},"large":{"w":1440,"h":1800,"resize":"fit"}}}]}
at entities of type org.json.JSONObject cannot be converted to JSONArray*/
