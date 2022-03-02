package defpackage;

import java.util.concurrent.Callable;

/* renamed from: thy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class thy implements Callable {
    private final tib a;
    private final tia b;
    private final Callable c;

    public thy(tib tib, tia tia, Callable callable) {
        this.a = tib;
        this.b = tia;
        this.c = callable;
    }

    public final Object call() {
        tib tib = this.a;
        tia tia = this.b;
        Callable callable = this.c;
        aosh a2 = tib.a(tib.a, tia);
        try {
            Object call = callable.call();
            a2.b((Object) null);
            return call;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            a2.a((Throwable) e);
            throw e;
        } catch (Exception e2) {
            a2.a((Throwable) e2);
            throw e2;
        }
    }
}
