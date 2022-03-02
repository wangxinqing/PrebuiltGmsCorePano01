package defpackage;

/* renamed from: amfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amfi extends aucj implements audy {
    public static final amfi c;
    private static volatile auef d;
    public aucs a = aucl.b;
    public aucx b = auei.b;

    static {
        amfi amfi = new amfi();
        c = amfi;
        aucj.a(amfi.class, (aucj) amfi);
    }

    private amfi() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", amfh.b(), "b", avkm.class});
        } else if (i2 == 3) {
            return new amfi();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (amfi.class) {
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
