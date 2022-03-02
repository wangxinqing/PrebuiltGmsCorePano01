package defpackage;

/* renamed from: ailr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ailr extends aucj implements audy {
    public static final ailr e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        ailr ailr = new ailr();
        e = ailr;
        aucj.a(ailr.class, (aucj) ailr);
    }

    private ailr() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", ajcd.class, "d", ailq.class});
        } else if (i2 == 3) {
            return new ailr();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ailr.class) {
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
