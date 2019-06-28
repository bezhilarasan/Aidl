/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\integra\\Downloads\\ImssServerApp\\ImssServerApp\\app\\src\\main\\aidl\\com\\imss\\deviceinfoserver\\IAppInfoService.aidl
 */
package com.imss.deviceinfoserver;
public interface IAppInfoService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.imss.deviceinfoserver.IAppInfoService
{
private static final java.lang.String DESCRIPTOR = "com.imss.deviceinfoserver.IAppInfoService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.imss.deviceinfoserver.IAppInfoService interface,
 * generating a proxy if needed.
 */
public static com.imss.deviceinfoserver.IAppInfoService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.imss.deviceinfoserver.IAppInfoService))) {
return ((com.imss.deviceinfoserver.IAppInfoService)iin);
}
return new com.imss.deviceinfoserver.IAppInfoService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_getAppInfoList:
{
data.enforceInterface(descriptor);
java.util.List<com.imss.deviceinfoserver.AppInfo> _result = this.getAppInfoList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.imss.deviceinfoserver.IAppInfoService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
@Override public java.util.List<com.imss.deviceinfoserver.AppInfo> getAppInfoList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.imss.deviceinfoserver.AppInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAppInfoList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.imss.deviceinfoserver.AppInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getAppInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
public java.util.List<com.imss.deviceinfoserver.AppInfo> getAppInfoList() throws android.os.RemoteException;
}
