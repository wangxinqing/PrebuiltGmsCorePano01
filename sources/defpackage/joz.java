package defpackage;

/* renamed from: joz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class joz extends aucj implements audy {
    public static final joz d;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;

    static {
        joz joz = new joz();
        d = joz;
        aucj.a(joz.class, (aucj) joz);
    }

    private joz() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\f\u0000\u0003\u001b\u0004\u001b", new Object[]{"e", "a", jox.a, "b", jpa.class, "c", jos.class});
        } else if (i2 == 3) {
            return new joz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (joz.class) {
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
