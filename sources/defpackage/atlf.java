package defpackage;

/* renamed from: atlf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atlf extends aucj implements audy {
    public static final atlf d;
    private static volatile auef f;
    public int a;
    public long b;
    public int c;
    private int e;

    static {
        atlf atlf = new atlf();
        d = atlf;
        aucj.a(atlf.class, (aucj) atlf);
    }

    private atlf() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\f\u0002", new Object[]{"e", "a", atld.a, "b", "c", attl.a});
        } else if (i2 == 3) {
            return new atlf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atlf.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
