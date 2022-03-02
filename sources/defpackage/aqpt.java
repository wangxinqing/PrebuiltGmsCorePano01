package defpackage;

/* renamed from: aqpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpt extends aucj implements audy {
    public static final aqpt d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public aqps c;

    static {
        aqpt aqpt = new aqpt();
        d = aqpt;
        aucj.a(aqpt.class, (aucj) aqpt);
    }

    private aqpt() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000", new Object[]{"a", "b", aqpv.class, "c"});
        } else if (i2 == 3) {
            return new aqpt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqpt.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
