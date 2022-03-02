package defpackage;

/* renamed from: lht  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lht {
    private static final ith a = new ith("PreferenceGuard", "");
    private lhs b;
    public final lhr i = new lhr();

    private final void a(int i2) {
        if (i2 != this.i.a()) {
            this.i.a(i2);
        }
    }

    public abstract lic a();

    public abstract void c(jzy jzy);

    public final synchronized boolean c() {
        return this.i.a() == 0;
    }

    public final synchronized void d() {
        a(3);
    }

    public final synchronized boolean e() {
        return this.i.a() == 3;
    }

    public final synchronized void f() {
        lhs lhs = this.b;
        if (lhs == null) {
            a.c("PreferenceGuard", "The cleaner was not defined.");
        } else {
            lhs.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(lhs lhs) {
        iva.a((Object) lhs);
        this.b = lhs;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(boolean z) {
        if (!e()) {
            a(!z ? 2 : 0);
        }
    }
}
