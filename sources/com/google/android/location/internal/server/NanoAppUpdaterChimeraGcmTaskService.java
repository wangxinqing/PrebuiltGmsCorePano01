package com.google.android.location.internal.server;

import android.content.Context;
import android.util.Log;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NanoAppUpdaterChimeraGcmTaskService extends qwf {
    private static final aoru a = new jfz(1, 10);
    private static boolean b = false;
    private static final Object c = new Object();

    public static void a(Context context) {
        synchronized (c) {
            if (!b) {
                b = true;
                a(context.getApplicationContext(), 1);
            }
        }
    }

    public static void b() {
        a((Context) ihs.b());
    }

    public static void a(Context context, int i) {
        a.execute(new aipy(context, i));
    }

    public static void a(Context context, long j) {
        try {
            qxi qxi = new qxi();
            qxi.a = j;
            qxi.n = true;
            qxi.i = "com.google.android.location.internal.NanoAppUpdaterGcmTaskService";
            qxi.a(1, 1);
            qxi.a(2);
            qxi.b(1);
            qxi.k = "LocationNanoAppUpdate";
            qwq.a(context).a((qxx) qxi.b());
        } catch (Exception e) {
            Log.e("NanoAppLifecycle", "Service: Scheduling periodic check", e);
        }
    }

    public final int a(qxz qxz) {
        new Object[1][0] = "Service:";
        a((Context) this, 2);
        return 0;
    }
}
