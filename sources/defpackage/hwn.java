package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: hwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwn {
    private static hwn c;
    private static long e;
    private static long f;
    public boolean a;
    public final Object b = new Object();
    private final qwq d;

    public hwn(qwq qwq) {
        this.d = qwq;
    }

    public static synchronized hwn a() {
        hwn hwn;
        synchronized (hwn.class) {
            if (c == null) {
                d();
                hwn hwn2 = new hwn(qwq.a((Context) ihs.b()));
                c = hwn2;
                hwn2.a(0);
                awtp.c();
                hwn2.c();
                hwn2.e();
            }
            if (d()) {
                Log.i("QosScheduler", "intervals changed, updating periodic schedulers");
                hwn hwn3 = c;
                awtp.c();
                hwn3.c();
                hwn3.e();
            }
            hwn = c;
        }
        return hwn;
    }

    private static long b(long j) {
        return TimeUnit.SECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    private static final long c(long j) {
        return Math.min(j, Math.max(60, -60 + j));
    }

    private static synchronized boolean d() {
        boolean z;
        synchronized (hwn.class) {
            long h = awtr.h();
            long i = awtr.i();
            awtp.c();
            if (e == h && f == i) {
                z = false;
            } else {
                e = h;
                f = i;
                z = true;
            }
        }
        return z;
    }

    private final void e() {
        long max = Math.max(30, b(awtr.i()));
        long c2 = c(max);
        StringBuilder sb = new StringBuilder(87);
        sb.append("schedule unmetered periodic Task: period=");
        sb.append(max);
        sb.append(" flex=");
        sb.append(c2);
        sb.toString();
        qxi qxi = new qxi();
        qxi.k = "qos_unmetered_periodic";
        qxi.i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        qxi.a = max;
        qxi.b = c2;
        qxi.b(1);
        qxi.a(0, 0);
        qxi.b(1, 1);
        qxi.a(false);
        this.d.a((qxx) qxi.b());
    }

    public final void b() {
        long b2 = b(awtm.a.a().b());
        StringBuilder sb = new StringBuilder(72);
        sb.append("schedule oneoff collect-for-debug Task: windowStart=");
        sb.append(b2);
        sb.toString();
        qxf qxf = new qxf();
        qxf.i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        qxf.a(b2, TimeUnit.HOURS.toSeconds(2));
        qxf.k = "qos_collect_for_debug_upload";
        qxf.a(0, 0);
        qxf.b(0, 0);
        qxf.a(false);
        qxf.b(1);
        this.d.a((qxx) qxf.b());
    }

    public final void c() {
        long max = Math.max(30, b(awtr.h()));
        long c2 = c(max);
        StringBuilder sb = new StringBuilder(85);
        sb.append("schedule default periodic Task: period=");
        sb.append(max);
        sb.append(" flex=");
        sb.append(c2);
        sb.toString();
        qxi qxi = new qxi();
        qxi.k = "qos_default_periodic";
        qxi.i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        qxi.a = max;
        qxi.b = c2;
        qxi.a(0, 0);
        qxi.b(0, 0);
        qxi.a(false);
        qxi.b(1);
        this.d.a((qxx) qxi.b());
    }

    public final void a(long j) {
        synchronized (this.b) {
            long q = awtr.a.a().q();
            if (j < q) {
                j = q;
            }
            long b2 = b(j);
            StringBuilder sb = new StringBuilder(54);
            sb.append("schedule oneoff Task: windowStart=");
            sb.append(b2);
            sb.toString();
            qxf qxf = new qxf();
            qxf.i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
            qxf.a(b2, TimeUnit.DAYS.toSeconds(100));
            qxf.k = "qos_oneoff";
            qxf.a(0, 0);
            qxf.b(0, 0);
            qxf.a(false);
            qxf.b(0);
            this.d.a((qxx) qxf.b());
            this.a = true;
        }
    }
}
