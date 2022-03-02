package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class SettingInjectorService extends Service {
    public static final String ACTION_INJECTED_SETTING_CHANGED = "android.location.InjectedSettingChanged";
    public static final String ACTION_SERVICE_INTENT = "android.location.SettingInjectorService";
    public static final String ATTRIBUTES_NAME = "injected-location-setting";
    public static final String META_DATA_NAME = "android.location.SettingInjectorService";
    private bjp a;
    private final String b;

    public SettingInjectorService(String str) {
        this.b = str;
    }

    public static void refreshSettings(Context context) {
        android.location.SettingInjectorService.refreshSettings(context);
    }

    public final IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public abstract boolean onGetEnabled();

    public abstract String onGetSummary();

    public final void onStart(Intent intent, int i) {
        this.a.onStart(intent, i);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return this.a.onStartCommand(intent, i, i2);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjp bjp = new bjp(this, this.b);
        this.a = bjp;
        bjp.attachBaseContext(context);
    }
}
