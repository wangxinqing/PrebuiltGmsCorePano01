package defpackage;

import android.os.Looper;

/* renamed from: rop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rop {
    public static Looper a(Looper looper) {
        boolean z;
        if (looper != null) {
            return looper;
        }
        if (Looper.myLooper() != null) {
            z = true;
        } else {
            z = false;
        }
        iva.a(z, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
