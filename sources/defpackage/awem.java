package defpackage;

import java.util.concurrent.Executor;

/* renamed from: awem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class awem extends awel implements Executor, aoqb {
    private final bapu b;
    private final awey c;
    private final bapu d;
    private volatile awex e = null;

    protected awem(bapu bapu, awey awey, bapu bapu2) {
        awdx.a(bapu);
        this.b = bapu;
        this.c = awey;
        awdx.a(bapu2);
        this.d = bapu2;
    }

    /* access modifiers changed from: protected */
    public abstract aorr a();

    @Deprecated
    public final aorr a(Object obj) {
        this.e.c();
        try {
            return b(obj);
        } finally {
            this.e.d();
        }
    }

    /* access modifiers changed from: protected */
    public abstract aorr b(Object obj);

    /* access modifiers changed from: protected */
    public final aorr c() {
        this.e = ((awfc) this.b.a()).a(this.c);
        this.e.a();
        aorr a = aopr.a(a(), (aoqb) this, (Executor) this);
        this.e.a(a);
        return a;
    }

    @Deprecated
    public final void execute(Runnable runnable) {
        this.e.b();
        ((Executor) this.d.a()).execute(runnable);
    }
}
