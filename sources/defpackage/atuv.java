package defpackage;

/* renamed from: atuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atuv extends aucj implements audy {
    public static final atuv c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public atuu b;

    static {
        atuv atuv = new atuv();
        c = atuv;
        aucj.a(atuv.class, (aucj) atuv);
        atjm atjm = atjm.a;
        atuv atuv2 = c;
        d = aucj.a((audx) atjm, (Object) atuv2, (audx) atuv2, 114881661, aufw.MESSAGE);
    }

    private atuv() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new atuv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atuv.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
