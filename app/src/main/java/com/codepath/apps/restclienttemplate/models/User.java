package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {

    public String name;
    public String handler;
    public String screenName;
    public String profileImageUrl;

    // empty constructor needed by the Parceler library
    public User() {
    }

    public static User fromJson(JSONObject jsonObject) throws JSONException {
        User user = new User();
        user.name = jsonObject.getString("name");
        user.handler = jsonObject.getString("screen_name");
        user.profileImageUrl = jsonObject.getString("profile_image_url_https");
        user.screenName = jsonObject.getString("name");
        return user;
    }
}
