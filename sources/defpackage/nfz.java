package defpackage;

/* renamed from: nfz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nfz extends aucj implements audy {
    public static final nfz e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public int c;
    public aucx d = auei.b;

    static {
        nfz nfz = new nfz();
        e = nfz;
        aucj.a(nfz.class, (aucj) nfz);
    }

    private nfz() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", nfy.class});
        } else if (i2 == 3) {
            return new nfz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nfz.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
