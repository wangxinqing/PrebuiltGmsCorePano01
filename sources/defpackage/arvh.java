package defpackage;

/* renamed from: arvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arvh extends aucj implements audy {
    public static final arvh d;
    private static volatile auef e;
    public auay a = auay.b;
    public auay b = auay.b;
    public String c = "";

    static {
        arvh arvh = new arvh();
        d = arvh;
        aucj.a(arvh.class, (aucj) arvh);
    }

    private arvh() {
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
            return new arvh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arvh.class) {
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
