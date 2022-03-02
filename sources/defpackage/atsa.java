package defpackage;

/* renamed from: atsa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsa extends aucj implements audy {
    public static final atsa b;
    public static final auci c;
    private static volatile auef d;
    public aucx a = auei.b;

    static {
        atsa atsa = new atsa();
        b = atsa;
        aucj.a(atsa.class, (aucj) atsa);
        atjm atjm = atjm.a;
        atsa atsa2 = b;
        c = aucj.a((audx) atjm, (Object) atsa2, (audx) atsa2, 125695873, aufw.MESSAGE);
    }

    private atsa() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", atsb.class});
        } else if (i2 == 3) {
            return new atsa();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (atsa.class) {
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
