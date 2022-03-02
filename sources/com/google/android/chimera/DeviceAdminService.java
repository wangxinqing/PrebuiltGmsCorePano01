package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceAdminService extends Service {
    private bjd a;

    public final IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjd bjd = new bjd();
        this.a = bjd;
        bjd.attachBaseContext(context);
    }
}
