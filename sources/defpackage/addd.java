package defpackage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: addd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class addd {
    private static hol a;
    private static addc b;
    private static final Random c = new Random();

    public static synchronized addc a() {
        addc addc;
        synchronized (addd.class) {
            if (a == null) {
                a = new hol(ihs.b(), "STREAMZ_UDC", (String) null);
            }
            if (b == null) {
                b = new addc(qvj.b.c(2), new ahgr(a, "STREAMZ_UDC"), "STREAMZ_UDC");
            }
            addc = b;
        }
        return addc;
    }

    public static synchronized void a(long j, TimeUnit timeUnit) {
        synchronized (addd.class) {
            if (a != null) {
                a.a(j, timeUnit);
            }
        }
    }

    public static boolean a(long j) {
        return j > 0 && j < 2147483647L && c.nextInt((int) j) == 0;
    }
}
