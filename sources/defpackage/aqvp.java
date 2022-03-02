package defpackage;

/* renamed from: aqvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqvp extends aucj implements audy {
    public static final aqvp g;
    private static volatile auef h;
    public aucx a = auei.b;
    public aqww b;
    public aqvk c;
    public aqwp d;
    public int e;
    public aqwn f;

    static {
        aqvp aqvp = new aqvp();
        g = aqvp;
        aucj.a(aqvp.class, (aucj) aqvp);
    }

    private aqvp() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002\t\u0003\t\u0004\t\u0006\f\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqvp();
        } else {
            if (i2 == 4) {
                return new aqvo();
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqvp.class) {
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
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}
