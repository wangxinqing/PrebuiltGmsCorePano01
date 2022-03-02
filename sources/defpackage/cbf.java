package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cbf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class cbf implements bus {
    public final Handler a(Looper looper) {
        if (cbi.k().c.getLooper() == looper) {
            return cbi.k().c;
        }
        return bus.a.a(looper);
    }
}
