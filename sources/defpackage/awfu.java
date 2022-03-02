package defpackage;

/* renamed from: awfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awfu extends aucj implements audy {
    public static final awfu c;
    private static volatile auef d;
    public awgr a;
    public String b = "";

    static {
        awfu awfu = new awfu();
        c = awfu;
        aucj.a(awfu.class, (aucj) awfu);
    }

    private awfu() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new awfu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (awfu.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
