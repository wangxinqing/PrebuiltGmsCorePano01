package defpackage;

/* renamed from: ouv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ouv extends aucj implements audy {
    public static final ouv c;
    private static volatile auef e;
    public aucx a = auei.b;
    public otv b;
    private int d;

    static {
        ouv ouv = new ouv();
        c = ouv;
        aucj.a(ouv.class, (aucj) ouv);
    }

    private ouv() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\t\u0000", new Object[]{"d", "a", ouu.class, "b"});
        } else if (i2 == 3) {
            return new ouv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ouv.class) {
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
