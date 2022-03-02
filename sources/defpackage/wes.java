package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wes implements Runnable {
    private final aosh a;
    private final Callable b;

    public wes(aosh aosh, Callable callable) {
        this.a = aosh;
        this.b = callable;
    }

    public final void run() {
        aosh aosh = this.a;
        try {
            aosh.b((Object) (Integer) this.b.call());
        } catch (Exception e) {
            aosh.a((Throwable) e);
        }
    }
}
