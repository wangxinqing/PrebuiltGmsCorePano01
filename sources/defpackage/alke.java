package defpackage;

import android.os.Looper;

/* renamed from: alke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alke {
    public static void a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("This method cannot be called from the UI thread.");
        }
    }
}
