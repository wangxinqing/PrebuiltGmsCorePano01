package defpackage;

/* renamed from: aodw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aodw extends aucj implements audy {
    public static final aodw c;
    private static volatile auef d;
    public int a;
    public int b;

    static {
        aodw aodw = new aodw();
        c = aodw;
        aucj.a(aodw.class, (aucj) aodw);
    }

    private aodw() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aodv.a});
        } else if (i2 == 3) {
            return new aodw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aodw.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}