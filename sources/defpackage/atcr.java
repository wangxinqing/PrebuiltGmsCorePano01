package defpackage;

/* renamed from: atcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atcr extends aucj implements audy {
    public static final atcr e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public int c;
    public boolean d;

    static {
        atcr atcr = new atcr();
        e = atcr;
        aucj.a(atcr.class, (aucj) atcr);
    }

    private atcr() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0000\u0003\u0007\u0001", new Object[]{"a", "b", atcq.class, "c", atbd.a, "d"});
        } else if (i2 == 3) {
            return new atcr();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atcr.class) {
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
