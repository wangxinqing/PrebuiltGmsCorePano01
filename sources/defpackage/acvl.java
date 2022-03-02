package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acvl implements acwb {
    public final Object a = new Object();
    public acvm b;
    private final Executor c;

    public acvl(Executor executor, acvm acvm) {
        this.c = executor;
        this.b = acvm;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
        }
    }

    public final void a(acwa acwa) {
        if (((acwi) acwa).d) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new acvk(this));
                }
            }
        }
    }
}
