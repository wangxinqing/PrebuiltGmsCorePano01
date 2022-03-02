package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: rmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class rmw {
    protected final Context a;
    public final nz b = new nz(1);
    public int c;

    public rmw(Context context) {
        this.a = context;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(int i) {
        synchronized (this.b) {
            int i2 = this.c;
            if (i != i2) {
                this.c = i;
                int i3 = 0;
                while (true) {
                    nz nzVar = this.b;
                    if (i3 < nzVar.h) {
                        Executor executor = (Executor) this.b.c(i3);
                        executor.execute(new rmv(this, (rng) nzVar.b(i3), executor, i2, i));
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();
}
