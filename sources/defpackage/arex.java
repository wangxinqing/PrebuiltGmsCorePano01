package defpackage;

/* renamed from: arex  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arex extends aucj implements audy {
    public static final arex t;
    private static volatile auef u;
    public int a;
    public float b;
    public long c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public float h;
    public float i;
    public aucx j = auei.b;
    public aucx k = auei.b;
    public float l;
    public boolean m;
    public int n;
    public aucx o = auei.b;
    public boolean p;
    public long q;
    public boolean r;
    public boolean s;

    static {
        arex arex = new arex();
        t = arex;
        aucj.a(arex.class, (aucj) arex);
    }

    private arex() {
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
            return aucj.a((audx) t, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0007\u0000\u0001\u0001\u0000\u0002\u0003\u0001\u0003\u001b\u0004\u001b\u0005\u0001\u0002\u0006\u0001\u0003\u0007\u001b\b\u001b\t\u0001\u0004\n\u0007\u0005\u000b\u0004\u0006\f\u001b\r\u0007\u0007\u000e\u0003\b\u000f\u001b\u0010\u001b\u0011\u0007\t\u0012\u0007\n", new Object[]{"a", "b", "c", "d", arfg.class, "g", arfe.class, "h", "i", "j", arev.class, "k", arev.class, "l", "m", "n", "o", arew.class, "p", "q", "e", arfg.class, "f", arfg.class, "r", "s"});
        } else if (i3 == 3) {
            return new arex();
        } else {
            if (i3 == 4) {
                return new aucd((short[][]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return t;
            }
            auef auef = u;
            if (auef == null) {
                synchronized (arex.class) {
                    auef = u;
                    if (auef == null) {
                        auef = new auce(t);
                        u = auef;
                    }
                }
            }
            return auef;
        }
    }
}
