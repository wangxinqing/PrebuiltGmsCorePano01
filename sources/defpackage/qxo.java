package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* renamed from: qxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qxo extends qxm {
    public qxo(Context context, int i, int i2) {
        super(context, i, i2);
    }

    public final void a(nxn nxn) {
        Log.e("GmsTaskScheduler", "sendWakeUpEvent called on SchedulerClientBroadcastStrategy");
    }

    public final void b(ComponentName componentName) {
        this.a.sendBroadcast(a(componentName));
    }

    public final void b(ComponentName componentName, String str) {
        this.a.sendBroadcast(a(componentName, str));
    }

    public final boolean b(qxx qxx) {
        this.a.sendBroadcast(a(qxx));
        return true;
    }
}
