package defpackage;

/* renamed from: apfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfw extends aucj implements audy {
    public static final apfw d;
    private static volatile auef f;
    public apfx a;
    public aucx b = auei.b;
    public int c;
    private int e;

    static {
        apfw apfw = new apfw();
        d = apfw;
        aucj.a(apfw.class, (aucj) apfw);
    }

    private apfw() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\f\u0001", new Object[]{"e", "a", "b", apft.class, "c", apfu.a});
        } else if (i2 == 3) {
            return new apfw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apfw.class) {
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
