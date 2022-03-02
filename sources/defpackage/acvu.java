package defpackage;

import java.util.concurrent.Executor;

/* renamed from: acvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acvu implements acwb {
    public final Object a = new Object();
    public acvv b;
    private final Executor c;

    public acvu(Executor executor, acvv acvv) {
        this.c = executor;
        this.b = acvv;
    }

    public final void a() {
        synchronized (this.a) {
            this.b = null;
        }
    }

    public final void a(acwa acwa) {
        if (acwa.b()) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.c.execute(new acvt(this, acwa));
                }
            }
        }
    }
}
