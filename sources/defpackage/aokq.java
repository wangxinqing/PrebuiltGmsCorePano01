package defpackage;

/* renamed from: aokq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokq extends aucj implements audy {
    public static final aokq f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;

    static {
        aokq aokq = new aokq();
        f = aokq;
        aucj.a(aokq.class, (aucj) aokq);
    }

    private aokq() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0002\u0003", new Object[]{"a", "b", "c", aona.a, "d", aomy.a, "e"});
        } else if (i2 == 3) {
            return new aokq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aokq.class) {
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
