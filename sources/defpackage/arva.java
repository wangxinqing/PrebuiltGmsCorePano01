package defpackage;

/* renamed from: arva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arva extends aucj implements audy {
    public static final arva d;
    private static volatile auef e;
    public auay a = auay.b;
    public auay b = auay.b;
    public String c = "";

    static {
        arva arva = new arva();
        d = arva;
        aucj.a(arva.class, (aucj) arva);
    }

    private arva() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arva();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arva.class) {
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
