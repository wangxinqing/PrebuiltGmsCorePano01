package defpackage;

/* renamed from: atzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzm extends aucj implements audy {
    public static final atzm g;
    private static volatile auef h;
    public int a;
    public atzl b;
    public atzn c;
    public atzf d;
    public atzn e;
    public aucx f = auei.b;

    static {
        atzm atzm = new atzm();
        g = atzm;
        aucj.a(atzm.class, (aucj) atzm);
    }

    private atzm() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0000\u0003\t\u0001\u0004\t\u0002\u0005\t\u0003\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", atzn.class});
        } else if (i2 == 3) {
            return new atzm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (atzm.class) {
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
}
