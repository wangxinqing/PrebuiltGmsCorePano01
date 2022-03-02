package defpackage;

/* renamed from: aqvc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqvc extends aucj implements audy {
    public static final aqvc c;
    private static volatile auef d;
    public aucx a = auei.b;
    public aqwp b;

    static {
        aqvc aqvc = new aqvc();
        c = aqvc;
        aucj.a(aqvc.class, (aucj) aqvc);
    }

    private aqvc() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqvc();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqvc.class) {
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
