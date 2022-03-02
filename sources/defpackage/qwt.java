package defpackage;

import java.util.concurrent.Callable;

/* renamed from: qwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qwt implements Callable {
    private final qwz a;
    private final qxz b;

    public qwt(qwz qwz, qxz qxz) {
        this.a = qwz;
        this.b = qxz;
    }

    public final Object call() {
        qwz qwz = this.a;
        qxz qxz = this.b;
        if (axbn.e()) {
            synchronized (qwz.j) {
                qwz.j.put(qxz.a, Thread.currentThread());
            }
        }
        try {
            int a2 = qwz.m.a(qxz);
            synchronized (qwz.j) {
                qwz.j.remove(qxz.a);
            }
            return Integer.valueOf(a2);
        } catch (Throwable th) {
            synchronized (qwz.j) {
                qwz.j.remove(qxz.a);
                throw th;
            }
        }
    }
}
