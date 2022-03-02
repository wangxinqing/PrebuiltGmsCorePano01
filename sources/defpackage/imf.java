package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* renamed from: imf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class imf {
    public static aorr a(Runnable runnable) {
        return a((Callable) Executors.callable(runnable));
    }

    public static aorr a(Callable callable) {
        aors a = aors.a(callable);
        new Thread(a).start();
        return a;
    }
}
