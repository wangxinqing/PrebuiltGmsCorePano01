package defpackage;

/* renamed from: apjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjk extends aucj implements audy {
    public static final apjk c;
    private static volatile auef e;
    public boolean a;
    public int b;
    private int d;

    static {
        apjk apjk = new apjk();
        c = apjk;
        aucj.a(apjk.class, (aucj) apjk);
    }

    private apjk() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\f\u0001", new Object[]{"d", "a", "b", apiu.a});
        } else if (i2 == 3) {
            return new apjk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (apjk.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
