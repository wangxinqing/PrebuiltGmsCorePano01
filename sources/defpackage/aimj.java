package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: aimj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aimj {
    public final aing a;

    public aimj(Context context) {
        aikq.a(context);
        int i = aing.E;
        synchronized (aing.class) {
            if (aing.A == null) {
                aing.A = new aing(context, new aekp());
                aing aing = aing.A;
                ainy ainy = aing.K;
                if (ainy != null) {
                    int i2 = 0;
                    for (ainx ainx : ainy.j.values()) {
                        int i3 = 0;
                        while (ainx != null) {
                            ainx ainx2 = ainx.b;
                            i3++;
                            ainx = null;
                        }
                        if (i2 < i3) {
                            i2 = i3;
                        }
                    }
                    ainy.d = new ainx[i2];
                    ainy.g = new ainx[i2];
                    ainy.h = 0;
                    for (ainx ainx3 = (ainx) ainy.j.get(ainy.k); ainx3 != null; ainx3 = null) {
                        ainx[] ainxArr = ainy.g;
                        int i4 = ainy.h;
                        ainxArr[i4] = ainx3;
                        ainx ainx4 = ainx3.b;
                        ainy.h = i4 + 1;
                    }
                    ainy.f = -1;
                    ainy.a();
                    ainy.i.c(ainy.obtainMessage(-2, ainy.b));
                }
                aink aink = aing.x;
                aink.a.getContentResolver().registerContentObserver(aeed.b, true, aink.b);
                aink.a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), true, aink.b);
                aiju aiju = aing.m.f;
                aiju.b = ikh.a(aiju.d, aiju.a, 2, new ike());
                aing.l.getApplicationContext().registerReceiver(aing.t, aing.s);
                int i5 = Build.VERSION.SDK_INT;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_FOREGROUND");
                intentFilter.addAction("android.intent.action.USER_BACKGROUND");
                aing.l.getApplicationContext().registerReceiver(aing.t, intentFilter);
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter2.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
                intentFilter2.addDataScheme("package");
                aing.l.getApplicationContext().registerReceiver(aing.t, intentFilter2);
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
                aing.l.getApplicationContext().registerReceiver(aing.t, intentFilter3, "com.google.android.gms.permission.INTERNAL_BROADCAST", (Handler) null);
                IntentFilter intentFilter4 = new IntentFilter("com.google.android.location.activity.DEEP_STILL_MODE_ENABLED");
                intentFilter4.addAction("com.google.android.location.activity.DEEP_STILL_MODE_DISABLED");
                aing.l.getApplicationContext().registerReceiver(aing.t, intentFilter4);
                jlq jlq = new jlq(aing.l);
                if (aybi.a.a().showMacAddressWhenDisconnected()) {
                    jlq.a(new aimw(aing));
                } else {
                    jlq.a(new aimn(aing));
                }
            }
        }
        this.a = aing.A;
    }
}
