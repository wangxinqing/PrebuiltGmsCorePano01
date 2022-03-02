package defpackage;

/* renamed from: aavs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavs extends aucj implements audy {
    public static final aavs e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aavj c;
    public aavj d;

    static {
        aavs aavs = new aavs();
        e = aavs;
        aucj.a(aavs.class, (aucj) aavs);
    }

    private aavs() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\t\u0001", new Object[]{"a", "b", aawd.class, "c", "d"});
        } else if (i2 == 3) {
            return new aavs();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aavs.class) {
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
