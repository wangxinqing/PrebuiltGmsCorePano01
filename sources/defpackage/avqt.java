package defpackage;

/* renamed from: avqt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqt extends aucj implements audy {
    public static final avqt d;
    private static volatile auef f;
    public boolean a;
    public aucx b = auei.b;
    public audr c = audr.b;
    private int e;

    static {
        avqt avqt = new avqt();
        d = avqt;
        aucj.a(avqt.class, (aucj) avqt);
    }

    private avqt() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0000\u0001\u0007\u0000\u0002\u001b\u00032", new Object[]{"e", "a", "b", avqs.class, "c", avqr.a});
        } else if (i2 == 3) {
            return new avqt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avqt.class) {
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
