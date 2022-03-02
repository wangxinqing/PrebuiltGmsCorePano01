package defpackage;

/* renamed from: asrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrc extends aucj implements audy {
    public static final asrc h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;
    public aucx e = auei.b;
    public asvf f;
    public int g;

    static {
        asrc asrc = new asrc();
        h = asrc;
        aucj.a(asrc.class, (aucj) asrc);
    }

    private asrc() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001a\u0004\u001b\u0005\t\u0002\u0006\f\u0003", new Object[]{"a", "b", "c", "d", "e", asvg.class, "f", "g", asra.a});
        } else if (i3 == 3) {
            return new asrc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (asrc.class) {
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
