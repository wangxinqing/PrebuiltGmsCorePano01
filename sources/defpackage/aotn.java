package defpackage;

/* renamed from: aotn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aotn extends aucj implements audy {
    public static final aotn d;
    private static volatile auef e;
    public int a;
    public auay b = auay.b;
    public aotp c;

    static {
        aotn aotn = new aotn();
        d = aotn;
        aucj.a(aotn.class, (aucj) aotn);
    }

    private aotn() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0000\u0006\n\u0000\u0007\t\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aotn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aotn.class) {
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
