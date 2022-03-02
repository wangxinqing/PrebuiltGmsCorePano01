package defpackage;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: agzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agzc {
    final long a;
    final long b;
    final boolean c;

    public agzc(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public static Object a(Callable callable) {
        try {
            return callable.call();
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
