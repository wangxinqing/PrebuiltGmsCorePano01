package defpackage;

/* renamed from: avri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avri extends aucj implements audy {
    public static final avri f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;

    static {
        avri avri = new avri();
        f = avri;
        aucj.a(avri.class, (aucj) avri);
    }

    private avri() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", avrh.a, "e"});
        } else if (i2 == 3) {
            return new avri();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avri.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
