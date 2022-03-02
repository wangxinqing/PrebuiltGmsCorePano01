package com.google.android.chimera;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.List;

@ChimeraApiVersion(added = 102)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ChooserTargetService extends Service {
    private bja a;

    public IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public abstract List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter);

    public boolean onUnbind(Intent intent) {
        return this.a.onUnbind(intent);
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        this.a = new bja(this, context);
    }
}
