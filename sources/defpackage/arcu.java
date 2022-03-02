package defpackage;

/* renamed from: arcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcu extends aucj implements audy {
    public static final arcu c;
    private static volatile auef d;
    public arct a;
    public arcs b;

    static {
        arcu arcu = new arcu();
        c = arcu;
        aucj.a(arcu.class, (aucj) arcu);
    }

    private arcu() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0006\u0007\u0002\u0000\u0000\u0000\u0006\t\u0007\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new arcu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (arcu.class) {
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
