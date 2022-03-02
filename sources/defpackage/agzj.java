package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: agzj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agzj {
    private static Thread a;
    private static volatile Handler b;

    public static void a(Runnable runnable) {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(runnable);
    }

    public static void b() {
        if (!a()) {
            throw new RuntimeException("Must be called on the UI thread");
        }
    }

    public static void c() {
        if (a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }
}
