package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: aipe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aipe {
    public abstract void a();

    public abstract void b();

    public static aipe a(Context context, Handler handler, arnd arnd) {
        arnh a;
        if (!jkr.c() || !aydu.i() || (a = arnd.a(5147455389092024324L)) == null) {
            return new aipa();
        }
        return new aipd(context, a, handler);
    }
}
