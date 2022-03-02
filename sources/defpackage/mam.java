package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

/* renamed from: mam  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mam {
    public final Context a;
    private final lyp b;

    public mam(Context context) {
        this.a = context;
        this.b = lyp.a(context);
    }

    private static final qxf a(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("SCHEDULED_AT", System.currentTimeMillis());
        bundle.putLong("TASK_DEADLINE", System.currentTimeMillis() + (j * 1000));
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.droidguard.DroidGuardGcmTaskService";
        qxf.k = "dg_task";
        qxf.s = bundle;
        qxf.b(1);
        return qxf;
    }

    private final boolean c() {
        return maz.a(this.a).e() > 0;
    }

    private final qxg d() {
        maz a2 = maz.a(this.a);
        if (a2.e() >= a2.c()) {
            return e();
        }
        long max = Math.max(Math.max(0, a2.a() - System.currentTimeMillis()) / 1000, a2.e());
        long c = a2.c();
        qxf a3 = a(c);
        a3.a(max, c);
        a3.a(1);
        a3.a(1, 1);
        return a3.b();
    }

    private final qxg e() {
        long e = maz.a(this.a).e();
        long min = Math.min(axew.b(), 1 + e);
        qxf a2 = a(min);
        a2.a(e, min);
        a2.a(0);
        a2.a(0, axcc.c() ? 1 : 0);
        return a2.b();
    }

    public final void b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || c()) {
            a((qxx) e());
        } else {
            a("sa");
        }
    }

    private final void a(qxx qxx) {
        qwq.a(this.a).a(qxx);
    }

    public final void a() {
        NetworkInfo activeNetworkInfo;
        maz a2 = maz.a(this.a);
        long currentTimeMillis = System.currentTimeMillis();
        int i = (currentTimeMillis >= a2.a() ? currentTimeMillis < a2.b() ? 2 : 3 : 1) - 1;
        if (i == 0) {
            a((qxx) d());
        } else if (i != 1) {
            b();
        } else {
            try {
                int intExtra = this.a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1);
                if ((intExtra == 1 || intExtra == 2) && (activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() != 0 && !c()) {
                    a("su");
                    return;
                }
            } catch (Exception e) {
                this.b.a((Throwable) e);
            }
            a((qxx) d());
        }
    }

    public final void a(String str) {
        new acrz(this.a, 1, "DG:service", (String) null, "com.google.android.gms").a(1000);
        Intent intent = new Intent("com.google.android.gms.droidguard.service.PING");
        intent.setClassName("com.google.android.gms", "com.google.android.gms.droidguard.DroidGuardService");
        aucd o = lyk.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        lyk lyk = (lyk) o.b;
        str.getClass();
        lyk.a |= 1;
        lyk.b = str;
        intent.putExtra("data", ((lyk) o.i()).k());
        this.a.startService(intent);
    }
}
