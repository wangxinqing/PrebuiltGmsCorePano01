package defpackage;

/* renamed from: alzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzw extends aucj implements audy {
    public static final alzw a;
    private static volatile auef c;
    private audr b = audr.b;

    static {
        alzw alzw = new alzw();
        a = alzw;
        aucj.a(alzw.class, (aucj) alzw);
    }

    private alzw() {
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0000vv\u0001\u0001\u0000\u0000v2", new Object[]{"b", alzv.a});
        } else if (i2 == 3) {
            return new alzw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (alzw.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(a);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
