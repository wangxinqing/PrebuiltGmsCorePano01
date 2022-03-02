package defpackage;

import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: khv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class khv implements Runnable {
    private final khw a;

    public khv(khw khw) {
        this.a = khw;
    }

    public final void run() {
        kky k;
        khw khw = this.a;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (khw.f) {
            kkf kkf = khw.c;
            Collection collection = khw.g;
            String a2 = knj.CONTENT_HASH.k.a();
            String a3 = kjr.a(collection, ",");
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 45 + String.valueOf(a2).length() + String.valueOf(a3).length());
            sb.append(a2);
            sb.append(" IN WipeoutFileContentHashView AND ");
            sb.append(a2);
            sb.append(" NOT IN (");
            sb.append(a3);
            sb.append(")");
            ((kjp) kkf).a.a(knk.a, kqz.a(sb.toString()));
        }
        khw.a(0);
        if (khw.d.f() != null) {
            lrs lrs = khw.d;
            long longValue = ((Long) jzq.A.c()).longValue();
            double doubleValue = ((Double) jzq.B.c()).doubleValue();
            double b = (double) lrs.b();
            Double.isNaN(b);
            long min = Math.min(longValue, (long) (doubleValue * b));
            long j = khw.c.j();
            khw.a.a("Shared cache bytes used: %d; limit: %d", Long.valueOf(j), Long.valueOf(min));
            if (j > min) {
                khw.c.d();
                try {
                    k = khw.c.k();
                    HashSet hashSet = new HashSet();
                    Iterator it = k.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        knh knh = (knh) it.next();
                        if (khw.c.j() <= min) {
                            break;
                        }
                        if (khw.d.f() == null) {
                            khw.a.b("ContentMaintenance", "External storage removed while pruning shared cache; aborting");
                        }
                        khw.a.a("Evicting from shared cache: %s", knh.a);
                        hashSet.add(knh.a);
                        knh.u();
                    }
                    khw.c.a((Set) hashSet);
                    khw.c.f();
                    k.close();
                    khw.c.e();
                } catch (Throwable th) {
                    khw.c.e();
                    throw th;
                }
            }
        }
        if (khw.d.f() != null) {
            lrs lrs2 = khw.d;
            long longValue2 = ((Long) jzq.C.c()).longValue();
            double doubleValue2 = ((Double) jzq.D.c()).doubleValue();
            long b2 = lrs2.b();
            long max = Math.max(0, lrs2.a() - ((Long) jzq.E.c()).longValue());
            double d = (double) b2;
            Double.isNaN(d);
            long min2 = Math.min(Math.min(longValue2, (long) (doubleValue2 * d)), max);
            if (khw.c.h() > min2) {
                kky a4 = ((kjr) khw.c).a("InternalContentView", kqz.a);
                try {
                    Iterator it2 = a4.iterator();
                    while (it2.hasNext()) {
                        knh knh2 = (knh) it2.next();
                        if (khw.c.h() <= min2) {
                            break;
                        }
                        khw.a(knh2);
                    }
                } finally {
                    a4.close();
                }
            }
        }
        iva.a(!khw.c.b(), (Object) "collectGarbage() must not be run while in a database transaction");
        try {
            for (File file : khw.d.e().listFiles()) {
                if (khw.c.g(file.getName())) {
                    file.delete();
                }
            }
        } catch (IOException e) {
            khw.a.c("ContentMaintenance", "Unable to open internal content directory; skipping internal content garbage collection.", e);
        }
        File f = khw.d.f();
        if (f != null) {
            for (File file2 : f.listFiles()) {
                if (khw.c.g(file2.getName())) {
                    file2.delete();
                }
            }
        }
        lkj.a(khw.b, khw.c);
        if (khw.h + ((Long) jzq.H.c()).longValue() <= System.currentTimeMillis()) {
            khw.h = System.currentTimeMillis();
            lfq c = khw.e.c();
            c.j();
            c.c(1, 24);
            c.a(khw.d.c(), khw.c.i());
            c.a();
        }
        khw.a.a("Content maintenance completed successfully in %d ms (uptime)", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
    }
}
