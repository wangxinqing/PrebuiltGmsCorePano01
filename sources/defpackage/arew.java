package defpackage;

/* renamed from: arew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arew extends aucj implements audy {
    public static final arew e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucr c = aubz.b;
    public String d = "";

    static {
        arew arew = new arew();
        e = arew;
        aucj.a(arew.class, (aucj) arew);
    }

    private arew() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0003\u0000\u0002\u0013\u0003\b\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new arew();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arew.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
