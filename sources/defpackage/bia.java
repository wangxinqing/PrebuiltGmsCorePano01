package defpackage;

/* renamed from: bia  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bia extends aucj implements audy {
    public static final bia c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public String b = "";

    static {
        bia bia = new bia();
        c = bia;
        aucj.a(bia.class, (aucj) bia);
        bic bic = bic.a;
        bia bia2 = c;
        d = aucj.a((audx) bic, (Object) bia2, (audx) bia2, 228908424, aufw.MESSAGE);
    }

    private bia() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bia();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (bia.class) {
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
