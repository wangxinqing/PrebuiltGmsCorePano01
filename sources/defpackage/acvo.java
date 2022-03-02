package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvo implements acwb {
    public final Object a = new Object();
    public acvp b;
    private final Executor c;

    public acvo(Executor executor, acvp acvp) {
        this.c = executor;
        this.b = acvp;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
        }
    }

    public final void a(acwa acwa) {
        synchronized (this.a) {
            if (this.b != null) {
                this.c.execute(new acvn(this, acwa));
            }
        }
    }
}
