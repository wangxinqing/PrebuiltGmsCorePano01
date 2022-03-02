package defpackage;

/* renamed from: lia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lia extends lht {
    public final lhz a = new lhz(this);
    private final lic b = new lha(this.i);
    private lgx c;

    static {
        new ith("UnrestrictedPreferenceG", "");
    }

    public final lic a() {
        return this.b;
    }

    public final void c(jzy jzy) {
        throw null;
    }

    public final synchronized void a(lgx lgx) {
        if (!e() && !lgx.equals(this.c)) {
            this.c = lgx;
            a(lgx.b);
        }
    }
}
