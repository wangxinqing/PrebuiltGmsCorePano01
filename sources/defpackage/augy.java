package defpackage;

/* renamed from: augy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augy extends aucj implements audy {
    public static final augy a;
    private static volatile auef c;
    private audr b = audr.b;

    static {
        augy augy = new augy();
        a = augy;
        aucj.a(augy.class, (aucj) augy);
    }

    private augy() {
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"b", augx.a});
        } else if (i2 == 3) {
            return new augy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (augy.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(a);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
