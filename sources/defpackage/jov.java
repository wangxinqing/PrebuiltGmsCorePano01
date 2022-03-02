package defpackage;

/* renamed from: jov  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jov extends aucj implements audy {
    public static final jov e;
    private static volatile auef g;
    public String a = "";
    public String b = "";
    public aucx c = auei.b;
    public int d;
    private int f;

    static {
        jov jov = new jov();
        e = jov;
        aucj.a(jov.class, (aucj) jov);
    }

    private jov() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\f\u0002", new Object[]{"f", "a", "b", "c", jpa.class, "d", jot.a});
        } else if (i2 == 3) {
            return new jov();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (jov.class) {
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
