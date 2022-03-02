package defpackage;

/* renamed from: avjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avjo extends aucj implements audy {
    public static final avjo c;
    private static volatile auef e;
    public aucx a = auei.b;
    public int b;
    private int d;

    static {
        avjo avjo = new avjo();
        c = avjo;
        aucj.a(avjo.class, (aucj) avjo);
    }

    private avjo() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u0005\u0002\u0000\u0001\u0000\u0002\u001b\u0005\f\u0003", new Object[]{"d", "a", avjq.class, "b", avjm.a});
        } else if (i2 == 3) {
            return new avjo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avjo.class) {
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
