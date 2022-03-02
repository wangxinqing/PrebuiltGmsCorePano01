package defpackage;

/* renamed from: awgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgk extends aucj implements audy {
    public static final awgk e;
    private static volatile auef f;
    public awgr a;
    public String b = "";
    public awgp c;
    public awfw d;

    static {
        awgk awgk = new awgk();
        e = awgk;
        aucj.a(awgk.class, (aucj) awgk);
    }

    private awgk() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\t\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new awgk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (awgk.class) {
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
