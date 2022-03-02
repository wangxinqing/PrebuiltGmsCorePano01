package defpackage;

/* renamed from: anxs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxs extends aucj implements audy {
    public static final anxs d;
    private static volatile auef e;
    public int a;
    public anxy b;
    public anxv c;

    static {
        anxs anxs = new anxs();
        d = anxs;
        aucj.a(anxs.class, (aucj) anxs);
    }

    private anxs() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u000e\u000f\u0002\u0000\u0000\u0000\u000e\t\f\u000f\t\r", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new anxs();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (anxs.class) {
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
