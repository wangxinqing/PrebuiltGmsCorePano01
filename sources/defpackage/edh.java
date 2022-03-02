package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: edh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class edh implements ecg {
    public final Context a;
    public final egi b = new egi(ecf.class);
    public final eew c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public volatile eef f;
    public volatile long g = 0;

    public edh(Context context) {
        eef a2 = eef.a(context);
        this.a = context;
        this.f = a2;
        this.c = (eew) thl.a(context, eew.class);
    }

    private final void g() {
        this.e.set(true);
    }

    public final int a() {
        return this.f.e;
    }

    public final int b() {
        return !this.f.d ? 1 : 2;
    }

    public final boolean c() {
        return this.d.get();
    }

    public final void d() {
        if (c()) {
            g();
        }
    }

    public final boolean e() {
        if (c()) {
            return false;
        }
        jjg jjg = edx.a;
        try {
            this.f = eef.a(this.a);
            return true;
        } catch (IllegalArgumentException e2) {
            anih anih = (anih) edx.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("edh", "e", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to create RecordingConfiguration with new settings");
            return true;
        }
    }

    public final void f() {
        edu.a(this.a);
        for (ecf b2 : (ecf[]) this.b.a) {
            b2.b();
        }
    }

    public final void a(ecf ecf) {
        this.b.a((Object) ecf);
        if (!c()) {
            Context context = this.a;
            Intent intent = new Intent("com.google.android.googlequicksearchbox.action.PAUSE_HOTWORD");
            intent.setPackage("com.google.android.googlequicksearchbox");
            intent.putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", context.getPackageName());
            context.sendBroadcast(intent);
            if (!this.d.compareAndSet(false, true)) {
                jjg jjg = edx.a;
                return;
            }
            this.e.set(false);
            int i = this.f.f;
            double n = aymc.a.a().n();
            int b2 = b();
            int i2 = b2 + b2;
            double d2 = (double) i;
            Double.isNaN(d2);
            long l = aymc.a.a().l();
            int i3 = this.f.e;
            int i4 = ((((int) (d2 * n)) + (i2 - 1)) / i2) * i2;
            double b3 = (double) ((i3 + i3) * b());
            double d3 = (double) ((long) ((int) l));
            Double.isNaN(d3);
            Double.isNaN(b3);
            new Thread(new edg(this, Math.max(i4, (int) (b3 * (d3 / 1000.0d)))), "AudioModemRecorder").start();
            return;
        }
        jjg jjg2 = edx.a;
    }

    public final void b(ecf ecf) {
        boolean z;
        synchronized (this.b) {
            z = false;
            if (this.b.b(ecf) && this.b.a()) {
                z = true;
            }
        }
        if (z) {
            g();
        }
    }
}
