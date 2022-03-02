package defpackage;

/* renamed from: asqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqd extends aucj implements audy {
    public static final asqd j;
    private static volatile auef k;
    public auay a = auay.b;
    public auay b = auay.b;
    public auay c = auay.b;
    public aufc d;
    public aufc e;
    public boolean f;
    public auay g = auay.b;
    public auay h = auay.b;
    public auay i = auay.b;

    static {
        asqd asqd = new asqd();
        j = asqd;
        aucj.a(asqd.class, (aucj) asqd);
    }

    private asqd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) j, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n\u0004\t\u0005\t\u0006\u0007\u0007\n\b\n\t\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new asqd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (asqd.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
