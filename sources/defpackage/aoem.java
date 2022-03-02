package defpackage;

/* renamed from: aoem  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoem extends aucj implements audy {
    public static final aoem d;
    private static volatile auef e;
    public int a;
    public int b;
    public int c;

    static {
        aoem aoem = new aoem();
        d = aoem;
        aucj.a(aoem.class, (aucj) aoem);
    }

    private aoem() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0000\u0003\u000b\u0001", new Object[]{"a", "b", aodb.a, "c"});
        } else if (i2 == 3) {
            return new aoem();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aoem.class) {
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
