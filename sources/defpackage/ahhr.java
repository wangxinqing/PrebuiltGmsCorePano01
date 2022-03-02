package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;

/* renamed from: ahhr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahhr {
    public static void a(StrictMode.ThreadPolicy threadPolicy) {
        StrictMode.setThreadPolicy(threadPolicy);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            new Handler(Looper.myLooper()).postAtFrontOfQueue(new ahhp(threadPolicy));
        }
    }

    public static StrictMode.ThreadPolicy b(StrictMode.ThreadPolicy threadPolicy) {
        return new StrictMode.ThreadPolicy.Builder(threadPolicy).detectAll().build();
    }
}
