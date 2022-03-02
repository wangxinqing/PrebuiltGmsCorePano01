package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: dpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class dpl extends BroadcastReceiver {
    static final String a = dpl.class.getName();
    public final dmd b;
    public boolean c;
    public boolean d;

    public dpl(dmd dmd) {
        iva.a((Object) dmd);
        this.b = dmd;
    }

    private final dpk e() {
        return this.b.a();
    }

    private final dly f() {
        return this.b.c();
    }

    public final void a() {
        e();
        f();
    }

    public final void b() {
        if (this.c) {
            this.b.a().b("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                e().e("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) d().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException e) {
            return false;
        }
    }

    public final Context d() {
        return this.b.a;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        a();
        String action = intent.getAction();
        this.b.a().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean c2 = c();
            if (this.d != c2) {
                this.d = c2;
                dly f = f();
                f.a("Network connectivity status changed", Boolean.valueOf(c2));
                f.g().a((Runnable) new dlt(f));
            }
        } else if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.b.a().d("NetworkBroadcastReceiver received unknown action", action);
        } else if (!intent.hasExtra(a)) {
            dly f2 = f();
            f2.b("Radio powered up");
            f2.q();
            Context d2 = f2.d();
            iva.a((Object) d2);
            if (dpr.c != null) {
                z = dpr.c.booleanValue();
            } else {
                try {
                    ActivityInfo receiverInfo = d2.getPackageManager().getReceiverInfo(new ComponentName(d2, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                    if (receiverInfo == null || !receiverInfo.enabled) {
                        z = false;
                    } else {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    z = false;
                }
                dpr.c = Boolean.valueOf(z);
            }
            if (!z || !dpv.a(d2)) {
                f2.a((dne) null);
                return;
            }
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(d2, "com.google.android.gms.analytics.AnalyticsService"));
            d2.startService(intent2);
        }
    }
}
