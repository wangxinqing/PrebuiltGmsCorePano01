package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qeq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qeq implements Callable {
    private final qer a;

    public qeq(qer qer) {
        this.a = qer;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        audx a2 = this.a.a();
        if (a2 != null) {
            qfn qfn = qes.a;
            new Object[1][0] = a2;
            return a2;
        }
        qes.a.b("Received null network response", new Object[0]);
        throw new babk(babj.d);
    }
}
