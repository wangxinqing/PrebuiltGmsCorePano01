package defpackage;

/* renamed from: hfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfk extends aucj implements audy {
    public static final hfk g;
    private static volatile auef h;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public boolean f = true;

    static {
        hfk hfk = new hfk();
        g = hfk;
        aucj.a(hfk.class, (aucj) hfk);
    }

    private hfk() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0003\u0000\u0001\u0004\u0000\u0003\u001b\u0005\u001b\u0007\u001b\b\u0007\u0001", new Object[]{"a", "b", "c", hfj.class, "d", boc.class, "e", boc.class, "f"});
        } else if (i2 == 3) {
            return new hfk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (hfk.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
