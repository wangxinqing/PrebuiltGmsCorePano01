package defpackage;

/* renamed from: aveh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aveh extends aucj implements audy {
    public static final aveh e;
    private static volatile auef f;
    public boolean a;
    public boolean b;
    public int c;
    public int d;

    static {
        aveh aveh = new aveh();
        e = aveh;
        aucj.a(aveh.class, (aucj) aveh);
    }

    private aveh() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aveh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aveh.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
