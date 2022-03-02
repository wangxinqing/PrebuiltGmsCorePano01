package defpackage;

/* renamed from: avwg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avwg extends aucj implements audy {
    public static final avwg c;
    private static volatile auef e;
    public aucx a = auei.b;
    public boolean b;
    private int d;

    static {
        avwg avwg = new avwg();
        c = avwg;
        aucj.a(avwg.class, (aucj) avwg);
    }

    private avwg() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003\u001b\u0004\u0007\u0000", new Object[]{"d", "a", avwi.class, "b"});
        } else if (i2 == 3) {
            return new avwg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avwg.class) {
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
