package defpackage;

/* renamed from: oul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oul extends aucj implements audy {
    public static final oul v;
    private static volatile auef w;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public oud o;
    public boolean p;
    public boolean q = true;
    public aucs r = aucl.b;
    public ovh s;
    public aucx t = auei.b;
    public int u;

    static {
        oul oul = new oul();
        v = oul;
        aucj.a(oul.class, (aucj) oul);
    }

    private oul() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) v, "\u0001\u0014\u0000\u0001\u0001\u001f\u0014\u0000\u0006\u0000\u0001\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u001b\u0006\u0004\u0002\u0007\u0007\u0003\b\u0007\f\n\u0004\u0005\u000b\f\u0006\f\u0007\u0007\r\u0007\b\u000f\f\t\u0010\u0007\n\u0011\t\u000b\u0012\u0007\r\u0013\u0016\u0014\t\u000e\u001b\u001a\u001e\u001b\u001f\u0004\u0010", new Object[]{"a", "b", ouc.class, "c", oui.class, "f", "d", ouk.class, "g", "h", "p", "i", "j", ouf.a, "k", "l", "m", oue.a, "n", "o", "q", "r", "s", "e", "t", ouh.class, "u"});
        } else if (i3 == 3) {
            return new oul();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (int[][][]) null);
            }
            if (i3 == 5) {
                return v;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (oul.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(v);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void b() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }
}
