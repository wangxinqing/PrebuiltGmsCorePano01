package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class rno implements Runnable {
    private final rnp a;
    private final rnr b;
    private final Executor c;
    private final Object d;

    public rno(rnp rnp, rnr rnr, Executor executor, Object obj) {
        this.a = rnp;
        this.b = rnr;
        this.c = executor;
        this.d = obj;
    }

    public final void run() {
        rnp rnp = this.a;
        rnr rnr = this.b;
        Executor executor = this.c;
        Object obj = this.d;
        synchronized (rnp.a) {
            if (rnp.a.get(rnr) == executor) {
                rnr.a(obj);
            }
        }
    }
}
