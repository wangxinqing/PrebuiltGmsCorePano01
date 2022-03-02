package defpackage;

/* renamed from: aqpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpx extends aucj implements audy {
    public static final aqpx e;
    private static volatile auef f;
    public int a;
    public int b = 0;
    public Object c;
    public aqsr d;

    static {
        aqpx aqpx = new aqpx();
        e = aqpx;
        aucj.a(aqpx.class, (aucj) aqpx);
    }

    private aqpx() {
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
            return aucj.a((audx) e, "\u0001\u0012\u0001\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b\t\u0011\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0013<\u0000", new Object[]{"c", "b", "a", aqqy.class, aqrm.class, aqqz.class, aqte.class, aqrs.class, aqqm.class, aqtq.class, aqpo.class, aqpn.class, aqsf.class, "d", aqsh.class, aqtc.class, aqqx.class, aqqt.class, aqrq.class, aqqw.class, aqqv.class});
        } else if (i2 == 3) {
            return new aqpx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqpx.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
