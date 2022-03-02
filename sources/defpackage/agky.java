package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: agky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agky implements agho, agkv {
    public static final anhq a = anhq.a("agky");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Application c;
    public final bapu d;
    public final int e;
    public final int f;
    public final int g;
    public final double h;
    public final int i;
    public final IntentFilter j = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final aekn k;
    public final agks l;
    public ScheduledFuture m;
    private final agkz n;
    private WifiManager o;

    public agky(agkt agkt, Application application, bapu bapu, amri amri, aekn aekn, agkz agkz) {
        this.l = agkt.a((Executor) bapu.a(), agnf.a());
        this.c = application;
        this.d = bapu;
        aghn aghn = (aghn) ((agha) amri.b()).a.b();
        this.e = aghn.b;
        this.f = aghn.e;
        this.g = aghn.c;
        this.i = aghn.d;
        this.h = aghn.f;
        this.k = aekn;
        this.n = agkz;
    }

    private final synchronized void g() {
        ScheduledFuture scheduledFuture = this.m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.m = null;
        }
    }

    public final bara a(Intent intent) {
        boolean z;
        aucd o2 = bara.f.o();
        if (this.o == null) {
            this.o = (WifiManager) this.c.getSystemService("wifi");
        }
        boolean isWifiEnabled = this.o.isWifiEnabled();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bara bara = (bara) o2.b;
        bara.a |= 4;
        bara.d = isWifiEnabled;
        boolean z2 = true;
        if (kf.a((Context) this.c, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                z = false;
            } else {
                z = true;
            }
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            bara bara2 = (bara) o2.b;
            bara2.a |= 8;
            bara2.e = z;
        }
        boolean c2 = agjs.c(this.c);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bara bara3 = (bara) o2.b;
        bara3.a |= 1;
        bara3.b = c2;
        int intExtra = intent.getIntExtra("status", -1);
        if (!(intExtra == 2 || intExtra == 5)) {
            z2 = false;
        }
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bara bara4 = (bara) o2.b;
        bara4.a = 2 | bara4.a;
        bara4.c = z2;
        return (bara) o2.i();
    }

    public final float b(Intent intent) {
        return ((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1));
    }

    public final void b() {
    }

    public final void c() {
        g();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void d() {
        if (!this.b.get()) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                agkz agkz = this.n;
                aekn aekn = agkz.a;
                long currentTimeMillis = System.currentTimeMillis();
                Long a2 = agkz.a(currentTimeMillis - (currentTimeMillis % 31557600000L));
                if (a2 == null) {
                    break;
                }
                long longValue = a2.longValue() - this.k.a();
                if (longValue > 0) {
                    long longValue2 = a2.longValue();
                    int i3 = this.g;
                    this.b.set(true);
                    this.m = ((aorv) this.d.a()).a((Runnable) new agkx(this, longValue2 + ((long) i3)), longValue, TimeUnit.MILLISECONDS);
                    break;
                }
                i2++;
            }
        }
    }

    public final synchronized File e() {
        String concat;
        File file;
        String a2 = agjs.a();
        concat = String.valueOf(a2).concat(".trace");
        File filesDir = this.c.getFilesDir();
        String valueOf = String.valueOf(a2);
        file = new File(filesDir, valueOf.length() == 0 ? new String("primes_profiling_") : "primes_profiling_".concat(valueOf));
        return (file.exists() || file.mkdir()) ? new File(file, concat) : null;
    }

    public final void f() {
        File e2 = e();
        if (e2 != null) {
            try {
                if (e2.exists()) {
                    e2.delete();
                }
            } catch (Exception e3) {
            }
        }
    }

    public final void a() {
        f();
        d();
    }
}
