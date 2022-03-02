package defpackage;

/* renamed from: aqxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxi extends aucj implements audy {
    public static final aqxi h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public auay c = auay.b;
    public aqwp d;
    public amfr e;
    public aqvp f;
    public int g;

    static {
        aqxi aqxi = new aqxi();
        h = aqxi;
        aucj.a(aqxi.class, (aucj) aqxi);
    }

    private aqxi() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0005\n\u0006\t\b\t\n\t", new Object[]{"a", "b", "g", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new aqxi();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqxi.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
