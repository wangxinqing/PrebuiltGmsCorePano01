package defpackage;

/* renamed from: plh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class plh extends aucj implements audy {
    public static final plh b;
    private static volatile auef c;
    public boolean a;

    static {
        plh plh = new plh();
        b = plh;
        aucj.a(plh.class, (aucj) plh);
    }

    private plh() {
    }

    public static aucd a() {
        return b.o();
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
        } else if (i2 == 3) {
            return new plh();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (plh.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
