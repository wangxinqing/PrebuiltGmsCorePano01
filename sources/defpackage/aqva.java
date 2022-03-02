package defpackage;

/* renamed from: aqva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqva extends aucj implements audy {
    public static final aqva d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aqwp b;
    public avki c;

    static {
        aqva aqva = new aqva();
        d = aqva;
        aucj.a(aqva.class, (aucj) aqva);
    }

    private aqva() {
        auei auei = auei.b;
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002Ț\u0003\t\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqva();
        } else {
            if (i2 == 4) {
                return new aucd((float[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqva.class) {
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
