package defpackage;

/* renamed from: aquf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aquf extends aucj implements audy {
    public static final aquf d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public aqug c;

    static {
        aquf aquf = new aquf();
        d = aquf;
        aucj.a(aquf.class, (aucj) aquf);
    }

    private aquf() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000", new Object[]{"a", "b", aque.class, "c"});
        } else if (i2 == 3) {
            return new aquf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aquf.class) {
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
