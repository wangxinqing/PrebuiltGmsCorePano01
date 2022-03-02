package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: anjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anjr extends anjf {
    public static final AtomicReference a = new AtomicReference();
    private static final AtomicLong c = new AtomicLong();
    private static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    private volatile anis b;

    public anjr(String str) {
        super(str);
        boolean z;
        boolean z2 = false;
        if (Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT)) {
            z = true;
        } else {
            z = false;
        }
        this.b = (!z && !(("goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE)) ? true : z2)) ? null : new anjg().a(a());
    }

    public static void b() {
        while (true) {
            anjr anjr = (anjr) anjp.a.poll();
            if (anjr != null) {
                anjr.b = ((anji) a.get()).a(anjr.a());
            } else {
                c();
                return;
            }
        }
    }

    private static void c() {
        while (true) {
            anjq anjq = (anjq) d.poll();
            if (anjq != null) {
                c.getAndDecrement();
                anis anis = anjq.a;
                anir anir = anjq.b;
                if (anir.j() || anis.a(anir.c())) {
                    anis.a(anir);
                }
            } else {
                return;
            }
        }
    }

    public final void a(anir anir) {
        if (this.b == null) {
            if (c.incrementAndGet() > 20) {
                d.poll();
                Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
            }
            d.offer(new anjq(this, anir));
            if (this.b != null) {
                c();
                return;
            }
            return;
        }
        this.b.a(anir);
    }

    public final boolean a(Level level) {
        if (this.b != null) {
            return this.b.a(level);
        }
        return true;
    }
}
