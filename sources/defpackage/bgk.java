package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: bgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bgk {
    public final Context a;
    public final nps b;
    public final npx c;
    public final nnt d;
    public final bhs e;
    volatile long f = 0;
    public final Object g = new Object();
    public volatile boolean h;
    private final Executor i;

    public bgk(Context context, nnt nnt, nps nps, npx npx, Executor executor, bhs bhs) {
        this.a = context;
        this.d = nnt;
        this.b = nps;
        this.c = npx;
        this.i = executor;
        this.e = bhs;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        long currentTimeMillis = System.currentTimeMillis();
        npr a2 = this.b.a();
        if (a2 != null) {
            if (!a2.b()) {
                this.c.a(a2);
                return;
            }
        }
        this.d.a(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.i.execute(new bgj(this));
    }
}
