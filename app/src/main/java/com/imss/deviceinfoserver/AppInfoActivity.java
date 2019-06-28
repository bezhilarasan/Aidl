package com.imss.deviceinfoserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AppInfoActivity extends AppCompatActivity {

    private static List<AppInfo> AppInfo;

    public static List<AppInfo> getAppInfo() {
        AppInfo = new ArrayList<>();
        AppInfo.add(new AppInfo(BuildConfig.VERSION_NAME, BuildConfig.VERSION_CODE));
        return AppInfo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_info);

    }

}
