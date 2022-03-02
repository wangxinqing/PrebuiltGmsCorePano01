package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acvr implements acwb {
    public final Object a = new Object();
    public acvs b;
    private final Executor c;

    public acvr(Executor executor, acvs acvs) {
        this.c = executor;
        this.b = acvs;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
        }
    }

    public final void a(acwa acwa) {
        if (!acwa.b() && !((acwi) acwa).d) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new acvq(this, acwa));
                }
            }
        }
    }
}
