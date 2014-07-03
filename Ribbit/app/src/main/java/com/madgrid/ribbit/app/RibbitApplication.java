package com.madgrid.ribbit.app;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by madgrid on 7/2/14.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "wwkdOYBosVXq8PuJkGY0SsyXuOf9JNzNsv3VI3rx", "xYQdVY7A8qFwQT1ElFOF40vr6tAp3zLb4NYzi3Yi");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
