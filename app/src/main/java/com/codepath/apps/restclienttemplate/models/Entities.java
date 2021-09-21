package com.codepath.apps.restclienttemplate.models;

import androidx.room.Entity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Parcel
@Entity
public class Entities {
    public User user;
    public Tweet tweet;
    public Urls urls;
    public String Media;
    public String Another_URl;
    //public boolean exists;
    public int exists;

    public Entities() {
    }

    public static Entities fromJson(JSONObject jsonObject) throws JSONException {
        Entities entities = new Entities();
        entities.exists = 0;
        if(jsonObject.has("media")) {
            JSONArray media_array = jsonObject.getJSONArray("media");
            for (int i = 0; i < media_array.length(); i++){
                JSONObject ListOfUrls = media_array.getJSONObject(i);
                entities.Media = null;
                if(ListOfUrls.getString("media_url_https").length() > 0) {
                    entities.exists = 1;
                    entities.Media = ListOfUrls.getString("media_url_https");
                }

            }

        }
        else{
            entities.exists = 3;
        }
        /*JSONArray urls_2= jsonObject.getJSONArray("media");
        String url_2 = null;
        if(urls_2.length() > 0) {
            for (int i = 0; i < urls_2.length(); i++) {
                JSONObject finding_media = urls_2.getJSONObject(i);
                JSONObject found = finding_media.getJSONObject("media_url_https");
                entities.Media = urls_2.getString(3);
                //url_2 = urls_2.getString(urls_2.length() - 1);
            }
        } else {
            url_2="unknown";
        }*/
        return entities;
    }





   /* boolean has(String media) {
        if(jsonObject.getJSONArray("media") != null && jsonObject.getJSONArray("media").length() > 0 ){
            return true;
        }
    }*/
}
/*Value [{"id":1441929903230922752,"id_str":"1441929903230922752","indices":[38,61],
"media_url":"http:\/\/pbs.twimg.com\/media\/FALDm3kXsAAOkN4.jpg",
"media_url_https":"https:\/\/pbs.twimg.com\/media\/FALDm3kXsAAOkN4.jpg",
"url":"https:\/\/t.co\/0PsgJNghgz","display_url":"pic.twitter.com\/0PsgJNghgz",
"expanded_url":"https:\/\/twitter.com\/EugenioDerbez\/status\/1441929945979269122\/photo\/1",
"type":"photo","sizes":{"small":{"w":544,"h":680,"resize":"fit"},"thumb":{"w":150,"h":150,"resize":"crop"},
"medium":{"w":960,"h":1200,"resize":"fit"},"large":{"w":1440,"h":1800,"resize":"fit"}}}]
at media of type org.json.JSONArray cannot be converted to JSONObject
 */