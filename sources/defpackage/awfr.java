package defpackage;

/* renamed from: awfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awfr extends aucj implements audy {
    public static final awfr d;
    private static volatile auef e;
    public aucx a = auei.b;
    public String b = "";
    public String c = "";

    static {
        awfr awfr = new awfr();
        d = awfr;
        aucj.a(awfr.class, (aucj) awfr);
    }

    private awfr() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new awfr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (awfr.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
