package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: acpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acpl {
    public static void a(Handler handler) {
        Looper looper = handler.getLooper();
        int i = Build.VERSION.SDK_INT;
        looper.quitSafely();
    }
}
