package defpackage;

/* renamed from: nqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nqa extends aucj implements audy {
    public static final nqa d;
    private static volatile auef f;
    public boolean a;
    public String b = "";
    public auay c = auay.b;
    private int e;

    static {
        nqa nqa = new nqa();
        d = nqa;
        aucj.a(nqa.class, (aucj) nqa);
    }

    private nqa() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new nqa();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nqa.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
