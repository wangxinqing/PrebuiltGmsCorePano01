package defpackage;

/* renamed from: awgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgr extends aucj implements audy {
    public static final awgr f;
    private static volatile auef g;
    public String a = "";
    public String b;
    public auay c;
    public awgn d;
    public awgp e;

    static {
        awgr awgr = new awgr();
        f = awgr;
        aucj.a(awgr.class, (aucj) awgr);
    }

    private awgr() {
        auay auay = auay.b;
        this.b = "";
        this.c = auay.b;
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\n\u0005\u0000\u0000\u0000\u0001Ȉ\u0003Ȉ\u0006\n\u0007\t\n\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new awgr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (awgr.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
