package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aaoy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaoy implements aapx {
    public static final /* synthetic */ int f = 0;
    public final hol a = new hol(ihs.b(), "GPP_UI", (String) null);
    public volatile boolean b = false;
    public acwa c = null;
    public final Object d = new Object();
    public volatile int e = 1;
    private final Executor g = qvj.b.b(2);

    static {
        aaoy.class.getName();
    }

    public aaoy() {
        a();
    }

    public static aapx b() {
        return aaox.a;
    }

    public final void a() {
        synchronized (this.d) {
            this.c = adrz.b(ihs.b()).o();
        }
    }

    public final void a(int i) {
        this.e = i;
    }

    public final void a(int i, int i2) {
        this.g.execute(new aaov(this, i2, i));
    }
}
