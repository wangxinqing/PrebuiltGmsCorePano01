package defpackage;

/* renamed from: aszu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszu extends aucj implements audy {
    public static final aszu d;
    private static volatile auef e;
    public int a;
    public String b = "";
    public aucs c = aucl.b;

    static {
        aszu aszu = new aszu();
        d = aszu;
        aucj.a(aszu.class, (aucj) aszu);
    }

    private aszu() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001e", new Object[]{"a", "b", "c", atab.b()});
        } else if (i2 == 3) {
            return new aszu();
        } else {
            if (i2 == 4) {
                return new aszt();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aszu.class) {
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
