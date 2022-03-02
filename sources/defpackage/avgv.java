package defpackage;

/* renamed from: avgv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avgv extends aucj implements audy {
    public static final avgv b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        avgv avgv = new avgv();
        b = avgv;
        aucj.a(avgv.class, (aucj) avgv);
        amdz amdz = amdz.a;
        avgv avgv2 = b;
        c = aucj.a((audx) amdz, (Object) avgv2, (audx) avgv2, 96705961, aufw.MESSAGE);
    }

    private avgv() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", avga.class});
        } else if (i2 == 3) {
            return new avgv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (avgv.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
