package defpackage;

/* renamed from: aqoc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqoc extends aucj implements audy {
    public static final aqoc h;
    private static volatile auef i;
    public int a;
    public auay b = auay.b;
    public int c;
    public aqoj d;
    public aqok e;
    public auay f = auay.b;
    public auay g = auay.b;

    static {
        aqoc aqoc = new aqoc();
        h = aqoc;
        aucj.a(aqoc.class, (aucj) aqoc);
    }

    private aqoc() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0000\u0002\u0004\u0002\u0003\t\u0003\u0004\t\u0004\u0005\n\u0005\u0006\n\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aqoc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqoc.class) {
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
