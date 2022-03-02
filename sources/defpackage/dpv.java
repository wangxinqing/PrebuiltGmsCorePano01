package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;

/* renamed from: dpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dpv {
    private static Boolean c;
    public final Handler a = new qvr();
    public final Context b;

    public dpv(Context context) {
        iva.a((Object) context);
        this.b = context;
    }

    public static boolean a(Context context) {
        iva.a((Object) context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
        }
        c = Boolean.valueOf(z);
        return z;
    }

    public final void b() {
        dmd.a(this.b).a().b("Device AnalyticsService is shutting down");
    }

    public final void a() {
        dmd.a(this.b).a().b("Device AnalyticsService is starting up");
    }

    public final void a(Runnable runnable) {
        dmd.a(this.b).c().a((dne) new dpt(this, runnable));
    }
}
