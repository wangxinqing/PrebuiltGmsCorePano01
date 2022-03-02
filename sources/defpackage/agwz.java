package defpackage;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: agwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agwz {
    private static boolean a;

    private agwz() {
    }

    static void a(aorv aorv) {
        int i = Build.VERSION.SDK_INT;
        synchronized (agwz.class) {
            if (!a) {
                TimeUnit timeUnit = TimeUnit.MINUTES;
                agwu.a((aorr) aorv.a((Runnable) new agwy(aorv, timeUnit), 10, timeUnit));
                a = true;
            }
        }
    }
}
