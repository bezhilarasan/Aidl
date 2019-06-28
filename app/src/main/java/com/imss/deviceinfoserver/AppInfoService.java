package com.imss.deviceinfoserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import java.util.List;

public class AppInfoService extends Service {

    private final IAppInfoService.Stub mBinder = new IAppInfoService.Stub() {

        @Override
        public List<AppInfo> getAppInfoList() throws RemoteException {
            return AppInfoActivity.getAppInfo();
        }


    };

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}