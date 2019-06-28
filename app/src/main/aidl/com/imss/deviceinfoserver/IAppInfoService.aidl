package com.imss.deviceinfoserver;
import com.imss.deviceinfoserver.AppInfo;

interface IAppInfoService {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    List<AppInfo> getAppInfoList();
}
