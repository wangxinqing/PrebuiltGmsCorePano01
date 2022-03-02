package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: afgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afgv {
    private final Object a;
    private final Throwable b;

    public afgv(Object obj, Throwable th) {
        this.a = obj;
        this.b = th;
    }

    public static afgv a(Exception exc) {
        amrl.a((Object) exc);
        return new afgv((Object) null, exc);
    }

    public final boolean a() {
        return this.b == null;
    }

    public final Object b() {
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw new ExecutionException(th);
    }

    public final Throwable c() {
        amrl.b(this.b != null, (Object) "Throwable was not initialized");
        return this.b;
    }
}
