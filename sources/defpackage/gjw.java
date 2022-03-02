package defpackage;

/* renamed from: gjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gjw extends aucj implements audy {
    public static final gjw d;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;

    static {
        gjw gjw = new gjw();
        d = gjw;
        aucj.a(gjw.class, (aucj) gjw);
    }

    private gjw() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0004\u001b", new Object[]{"e", "a", gju.a, "b", gjp.class, "c", gjt.class});
        } else if (i2 == 3) {
            return new gjw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (gjw.class) {
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
