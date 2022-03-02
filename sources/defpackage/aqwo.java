package defpackage;

/* renamed from: aqwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwo extends aucj implements audy {
    public static final aqwo b;
    private static volatile auef d;
    public boolean a;
    /* access modifiers changed from: private */
    public boolean c;

    static {
        aqwo aqwo = new aqwo();
        b = aqwo;
        aucj.a(aqwo.class, (aucj) aqwo);
    }

    private aqwo() {
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
            return aucj.a((audx) b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "c"});
        } else if (i2 == 3) {
            return new aqwo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqwo.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
