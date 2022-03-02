package defpackage;

/* renamed from: aqso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqso extends aucj implements audy {
    public static final aqso f;
    private static volatile auef g;
    public int a;
    public int b = 0;
    public Object c;
    public aqsr d;
    public boolean e;

    static {
        aqso aqso = new aqso();
        f = aqso;
        aucj.a(aqso.class, (aucj) aqso);
    }

    private aqso() {
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
            return aucj.a((audx) f, "\u0001\u000f\u0001\u0001\u0001Ϩ\u000f\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000Ϩ<\u0000", new Object[]{"c", "b", "a", "d", "e", aqsv.class, aqtw.class, aqts.class, aqqk.class, aqqe.class, aqqh.class, aqsy.class, aqrp.class, aqrx.class, aqty.class, aqsb.class, aqtj.class, aqsc.class});
        } else if (i2 == 3) {
            return new aqso();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqso.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
