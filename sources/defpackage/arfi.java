package defpackage;

/* renamed from: arfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arfi extends aucj implements audy {
    public static final arfi e;
    private static volatile auef f;
    public int a;
    public long b;
    public boolean c;
    public int d;

    static {
        arfi arfi = new arfi();
        e = arfi;
        aucj.a(arfi.class, (aucj) arfi);
    }

    private arfi() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0007\f\u0006", new Object[]{"a", "b", "c", "d", arfh.a});
        } else if (i2 == 3) {
            return new arfi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arfi.class) {
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
