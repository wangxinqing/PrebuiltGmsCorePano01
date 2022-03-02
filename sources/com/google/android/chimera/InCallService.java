package com.google.android.chimera;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.telecom.Phone;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class InCallService extends Service {
    private bji a;

    @Deprecated
    public Phone getPhone() {
        return this.a.getPhone();
    }

    public IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    @Deprecated
    public abstract void onPhoneCreated(Phone phone);

    @Deprecated
    public abstract void onPhoneDestroyed(Phone phone);

    public boolean onUnbind(Intent intent) {
        return this.a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bji bji = new bji(this);
        this.a = bji;
        bji.attachBaseContext(context);
    }
}
