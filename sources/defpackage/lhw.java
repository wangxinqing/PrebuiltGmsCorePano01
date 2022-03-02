package defpackage;

/* renamed from: lhw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lhw extends lht {
    private jzy a = null;
    private jzy b = kaa.a;

    protected lhw() {
    }

    private final jzy b() {
        jzy jzy = this.a;
        return jzy == null ? this.b : jzy;
    }

    /* access modifiers changed from: protected */
    public abstract void a(jzy jzy);

    public final synchronized void c(jzy jzy) {
        this.a = jzy;
        a(b());
    }

    /* access modifiers changed from: protected */
    public final synchronized void d(jzy jzy) {
        iva.a((Object) jzy);
        this.b = jzy;
        if (this.a == null) {
            a(b());
        }
    }
}
