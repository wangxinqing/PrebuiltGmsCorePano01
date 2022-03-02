package defpackage;

/* renamed from: avoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avoj extends aucj implements audy {
    public static final avoj e;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public int c;
    public int d;
    private int f;

    static {
        avoj avoj = new avoj();
        e = avoj;
        aucj.a(avoj.class, (aucj) avoj);
    }

    private avoj() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003\u0005\f\u0004", new Object[]{"f", "a", "b", "c", "d", avna.b()});
        } else if (i2 == 3) {
            return new avoj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avoj.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
