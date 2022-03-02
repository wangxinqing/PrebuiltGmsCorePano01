package defpackage;

import java.util.concurrent.Callable;

/* renamed from: aghe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aghe implements Callable {
    final /* synthetic */ Callable a;
    final /* synthetic */ aghf b;

    public aghe(aghf aghf, Callable callable) {
        this.b = aghf;
        this.a = callable;
    }

    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
            throw th;
        }
    }
}
