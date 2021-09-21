package com.codepath.apps.restclienttemplate.models;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel
public class Urls2 {

    public Urls2(){}

    public static Urls2 fromJson(JSONObject jsonObject) throws JSONException{
        Urls2 urls2 = new Urls2();

        return urls2;
    }

}
