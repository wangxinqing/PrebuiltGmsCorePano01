package defpackage;

/* renamed from: alnr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alnr extends aucj implements audy {
    public static final alnr b;
    private static volatile auef d;
    public String a = "";
    private int c;

    static {
        alnr alnr = new alnr();
        b = alnr;
        aucj.a(alnr.class, (aucj) alnr);
    }

    private alnr() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\b\u0002", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new alnr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (alnr.class) {
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
