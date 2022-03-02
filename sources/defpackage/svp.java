package defpackage;

import java.lang.Thread;

/* renamed from: svp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svp implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ svs a;
    private final String b;

    public svp(svs svs, String str) {
        this.a = svs;
        iva.a((Object) str);
        this.b = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.a.E().c.a(this.b, th);
    }
}
