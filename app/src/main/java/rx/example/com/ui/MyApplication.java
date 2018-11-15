package rx.example.com.ui;

import android.app.Application;
import android.content.Context;

import org.xutils.x;

public class MyApplication extends Application {
    public static class SingleToHolder {
        private static final MyApplication ourInstance = new MyApplication();
    }

    public static MyApplication getInstance() {
        return SingleToHolder.ourInstance;
    }

    private MyApplication() {
    }


    @Override
    public void onCreate() {
        super.onCreate();
        inti();
    }

    public Context getContext() {
        return this;
    }

    private void inti() {
        x.Ext.init(this);
    }

}
