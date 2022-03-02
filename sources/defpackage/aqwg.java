package defpackage;

/* renamed from: aqwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwg extends aucj implements audy {
    public static final aqwg g;
    private static volatile auef h;
    public aucx a = auei.b;
    public int b;
    public int c;
    public aqwp d;
    public aqww e;
    public aqwn f;

    static {
        aqwg aqwg = new aqwg();
        g = aqwg;
        aucj.a(aqwg.class, (aucj) aqwg);
    }

    private aqwg() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\b\u0006\u0000\u0001\u0000\u0001Ț\u0002\f\u0003\f\u0005\t\u0006\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqwg();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqwg.class) {
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
