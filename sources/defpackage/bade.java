package defpackage;

/* renamed from: bade  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bade implements bajp {
    private boolean a;
    private boolean b;
    private boolean c;
    private Runnable d;
    private boolean e;
    public final baet j;
    public final Object k = new Object();
    public final balu l;
    public int m;
    public boolean n;
    public final balm o;
    public baeh p;
    public azyi q;
    public volatile boolean r;
    public boolean s;

    private final void b() {
        boolean z;
        synchronized (this.k) {
            synchronized (this.k) {
                z = false;
                if (this.a && this.m < 32768 && !this.n) {
                    z = true;
                }
            }
        }
        if (z) {
            this.p.a();
        }
    }

    /* access modifiers changed from: protected */
    public void a() {
        boolean z;
        if (this.p != null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z);
        synchronized (this.k) {
            amrl.b(!this.a, (Object) "Already allocated");
            this.a = true;
        }
        b();
    }

    public final void c(int i) {
        boolean z;
        synchronized (this.k) {
            amrl.b(this.a, (Object) "onStreamAllocated was not called, but it seems the stream is active");
            int i2 = this.m;
            int i3 = i2 - i;
            this.m = i3;
            z = false;
            if (i2 >= 32768) {
                if (i3 < 32768) {
                    z = true;
                }
            }
        }
        if (z) {
            b();
        }
    }

    protected bade(int i, balm balm, balu balu) {
        amrl.a((Object) balm, (Object) "statsTraceCtx");
        amrl.a((Object) balu, (Object) "transportTracer");
        this.l = balu;
        this.j = new bajs(this, azxv.a, i, balm, balu);
        this.q = azyi.b;
        this.c = false;
        amrl.a((Object) balm, (Object) "statsTraceCtx");
        this.o = balm;
    }

    public final void a(babj babj, baeg baeg, baaf baaf) {
        if (!this.b) {
            this.b = true;
            balm balm = this.o;
            if (balm.c.compareAndSet(false, true)) {
                for (babm a2 : balm.b) {
                    a2.a();
                }
            }
            this.p.a(babj, baeg, baaf);
            balu balu = this.l;
            if (balu == null) {
                return;
            }
            if (!babj.a()) {
                balu.e++;
            } else {
                balu.d++;
            }
        }
    }

    public final void b(int i) {
        try {
            baet baet = this.j;
            amrl.a(true, (Object) "numMessages must be > 0");
            if (!((bajs) baet).a()) {
                ((bajs) baet).e += (long) i;
                ((bajs) baet).c();
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public final void a(babj babj, baeg baeg, boolean z, baaf baaf) {
        amrl.a((Object) babj, (Object) "status");
        amrl.a((Object) baaf, (Object) "trailers");
        if (!this.s || z) {
            this.s = true;
            this.e = babj.a();
            synchronized (this.k) {
                this.n = true;
            }
            if (!this.c) {
                this.d = new bacy(this, babj, baeg, baaf);
                if (!z) {
                    bajs bajs = (bajs) this.j;
                    if (bajs.a()) {
                        return;
                    }
                    if (bajs.b()) {
                        bajs.close();
                    } else {
                        bajs.f = true;
                    }
                } else {
                    this.j.close();
                }
            } else {
                this.d = null;
                a(babj, baeg, baaf);
            }
        }
    }

    public final void b(babj babj, boolean z, baaf baaf) {
        a(babj, baeg.PROCESSED, z, baaf);
    }

    public final void a(bajq bajq) {
        this.p.a(bajq);
    }

    public void a(boolean z) {
        amrl.b(this.s, (Object) "status should have been reported on deframer closed");
        this.c = true;
        if (this.e && z) {
            b(babj.n.a("Encountered end-of-stream mid-frame"), true, new baaf());
        }
        Runnable runnable = this.d;
        if (runnable != null) {
            runnable.run();
            this.d = null;
        }
    }
}
