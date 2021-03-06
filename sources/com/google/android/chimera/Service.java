package com.google.android.chimera;

import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class Service extends ContextWrapper implements bnu {
    public static final int START_CONTINUATION_MASK = 15;
    public static final int START_FLAG_REDELIVERY = 1;
    public static final int START_FLAG_RETRY = 2;
    public static final int START_NOT_STICKY = 2;
    public static final int START_REDELIVER_INTENT = 3;
    public static final int START_STICKY = 1;
    public static final int START_STICKY_COMPATIBILITY = 0;
    private android.app.Service Da;
    private ProxyCallbacks Db;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    public interface ProxyCallbacks {
        void superOnCreate();

        void superOnDestroy();

        int superOnStartCommand(Intent intent, int i, int i2);

        void superStopSelf();

        void superStopSelf(int i);

        boolean superStopSelfResult(int i);
    }

    public Service() {
        super((Context) null);
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Application getApplication() {
        return this.Da.getApplication();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.app.Service getContainerService() {
        return this.Da;
    }

    public abstract IBinder onBind(Intent intent);

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onCreate() {
        this.Db.superOnCreate();
    }

    public void onDestroy() {
        this.Db.superOnDestroy();
    }

    public void onLowMemory() {
    }

    public void onRebind(Intent intent) {
    }

    public void onStart(Intent intent, int i) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return this.Db.superOnStartCommand(intent, i, i2);
    }

    public void onTaskRemoved(Intent intent) {
    }

    public void onTrimMemory(int i) {
    }

    public boolean onUnbind(Intent intent) {
        return false;
    }

    public void publicDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        dump(fileDescriptor, printWriter, strArr);
    }

    public void setProxy(android.app.Service service, Context context) {
        this.Da = service;
        this.Db = (ProxyCallbacks) service;
        attachBaseContext(context);
    }

    public final void startForeground(int i, Notification notification) {
        this.Da.startForeground(i, notification);
    }

    public final void stopForeground(boolean z) {
        this.Da.stopForeground(z);
    }

    public final void stopSelf() {
        this.Db.superStopSelf();
    }

    public final boolean stopSelfResult(int i) {
        return this.Db.superStopSelfResult(i);
    }

    public final void stopSelf(int i) {
        this.Db.superStopSelf(i);
    }
}
