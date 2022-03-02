package defpackage;

/* renamed from: hmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmf extends aucj implements audy {
    public static final hmf e;
    private static volatile auef f;
    public int a;
    public hmi b;
    public hml c;
    public hmd d;

    static {
        hmf hmf = new hmf();
        e = hmf;
        aucj.a(hmf.class, (aucj) hmf);
    }

    private hmf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001댱%\u0003\u0000\u0000\u0000댱\t\u0001﹡\u0013\t\u0002%\t\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new hmf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (hmf.class) {
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
