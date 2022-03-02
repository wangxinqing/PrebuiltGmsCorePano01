package com.google.android.chimera;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.service.notification.Condition;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ConditionProviderService extends Service {
    public static final String PERMISSION_BIND = "android.permission.BIND_CONDITION_PROVIDER_SERVICE";
    private bjb a;

    public static void requestRebind(ComponentName componentName) {
        bjb.requestRebind(componentName);
    }

    public final void notifyCondition(Condition condition) {
        this.a.notifyCondition(condition);
    }

    public final void notifyConditions(Condition... conditionArr) {
        this.a.notifyConditions(conditionArr);
    }

    public IBinder onBind(Intent intent) {
        return this.a.onBind(intent);
    }

    public abstract void onConnected();

    public void onRequestConditions(int i) {
    }

    public abstract void onSubscribe(Uri uri);

    public abstract void onUnsubscribe(Uri uri);

    public final void requestUnbind() {
        this.a.requestUnbind();
    }

    public void setProxy(Service service, Context context) {
        super.setProxy(service, context);
        bjb bjb = new bjb(this);
        this.a = bjb;
        bjb.attachBaseContext(context);
    }
}
