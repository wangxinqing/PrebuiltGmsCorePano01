package defpackage;

/* renamed from: ptk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ptk extends aucj implements audy {
    public static final ptk f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public long c;
    public aucx d = auei.b;
    public ptj e;

    static {
        ptk ptk = new ptk();
        f = ptk;
        aucj.a(ptk.class, (aucj) ptk);
    }

    private ptk() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u001b\u0004\t\u0002", new Object[]{"a", "b", "c", "d", pti.class, "e"});
        } else if (i2 == 3) {
            return new ptk();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ptk.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
