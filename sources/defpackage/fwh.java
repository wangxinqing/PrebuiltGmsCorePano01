package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: fwh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fwh {
    public static final iwd a = new iwd("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        fwj.a(context).a();
        for (icc d : icc.a()) {
            d.d();
        }
        synchronized (ifn.f) {
            if (ifn.g != null) {
                ifn ifn = ifn.g;
                ifn.k.incrementAndGet();
                Handler handler = ifn.o;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }
}
