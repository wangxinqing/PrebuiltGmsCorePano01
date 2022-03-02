package defpackage;

/* renamed from: aqdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdi extends aucj implements audy {
    public static final aqdi h;
    private static volatile auef j;
    public int a;
    public String b = "";
    public auay c = auay.b;
    public auay d = auay.b;
    public auay e = auay.b;
    public auay f = auay.b;
    public int g;
    private byte i = 2;

    static {
        aqdi aqdi = new aqdi();
        h = aqdi;
        aucj.a(aqdi.class, (aucj) aqdi);
    }

    private aqdi() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\b\u0000\u0002\n\u0001\u0004Ԋ\u0002\u0005\n\u0003\u0006\n\u0004\u0007\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", aqdj.a});
        } else if (i3 == 3) {
            return new aqdi();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aqdi.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
