package defpackage;

/* renamed from: ajkb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajkb extends aucj implements audy {
    public static final ajkb d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public ajjq c;

    static {
        ajkb ajkb = new ajkb();
        d = ajkb;
        aucj.a(ajkb.class, (aucj) ajkb);
    }

    private ajkb() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\t\u0001", new Object[]{"a", "b", ajjm.class, "c"});
        } else if (i2 == 3) {
            return new ajkb();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ajkb.class) {
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
