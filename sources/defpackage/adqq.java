package defpackage;

/* renamed from: adqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adqq extends aucj implements audy {
    public static final adqq d;
    private static volatile auef e;
    public String a = "";
    public aucx b = auei.b;
    public adqr c;

    static {
        adqq adqq = new adqq();
        d = adqq;
        aucj.a(adqq.class, (aucj) adqq);
    }

    private adqq() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new adqq();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (adqq.class) {
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
