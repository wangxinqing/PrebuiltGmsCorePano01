package defpackage;

/* renamed from: aojr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aojr extends aucj implements audy {
    public static final aojr d;
    private static volatile auef e;
    public int a;
    public aojq b;
    public int c;

    static {
        aojr aojr = new aojr();
        d = aojr;
        aucj.a(aojr.class, (aucj) aojr);
    }

    private aojr() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0006\t\u0002\u0000\u0000\u0000\u0006\f\t\t\t\u0006", new Object[]{"a", "c", aond.b(), "b"});
        } else if (i2 == 3) {
            return new aojr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aojr.class) {
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
