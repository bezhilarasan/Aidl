package com.imss.deviceinfoserver;

import android.os.Parcel;
import android.os.Parcelable;

public class AppInfo implements Parcelable {

    public static final Creator<AppInfo> CREATOR = new Creator<AppInfo>() {
        @Override
        public AppInfo createFromParcel(Parcel in) {
            return new AppInfo(in);
        }

        @Override
        public AppInfo[] newArray(int size) {
            return new AppInfo[size];
        }
    };
    public String versionname;
    public int versionnumber;

    public AppInfo(String name, int versionnumber) {
        this.versionname = name;
        this.versionnumber = versionnumber;
    }

    public AppInfo() {
    }

    protected AppInfo(Parcel in) {
        versionname = in.readString();
        versionnumber = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(versionname);
        parcel.writeInt(versionnumber);
    }
}