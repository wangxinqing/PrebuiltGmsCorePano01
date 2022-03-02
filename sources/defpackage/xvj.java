package defpackage;

import android.net.NetworkCapabilities;
import java.util.concurrent.TimeUnit;

/* renamed from: xvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xvj {
    public static xvj a;
    private static long c = 0;
    public final ycw b = ybx.a;

    private xvj() {
        c = 0;
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 1;
        }
        if (networkCapabilities.hasTransport(1)) {
            return 2;
        }
        if (networkCapabilities.hasTransport(0)) {
            return 8;
        }
        if (networkCapabilities.hasTransport(2)) {
            return 9;
        }
        if (networkCapabilities.hasTransport(3)) {
            return 7;
        }
        return 1;
    }

    public static synchronized xvj a() {
        xvj xvj;
        synchronized (xvj.class) {
            if (a == null) {
                a = new xvj();
            }
            xvj = a;
        }
        return xvj;
    }

    public static void a(int i, int i2, String str) {
        if (!ayrt.b()) {
            return;
        }
        if (!ayrt.a.a().g() || System.currentTimeMillis() - c > TimeUnit.SECONDS.toMillis(ayrt.a.a().h())) {
            aucd o = xle.e.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xle xle = (xle) o.b;
            xle.b = 1;
            int i3 = 1 | xle.a;
            xle.a = i3;
            xle.c = i - 1;
            int i4 = i3 | 2;
            xle.a = i4;
            xle.d = i2 - 1;
            xle.a = i4 | 4;
            wml.a().a((xle) o.i(), str);
            c = System.currentTimeMillis();
        }
    }
}
