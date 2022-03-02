package defpackage;

/* renamed from: avfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfg extends aucj implements audy {
    public static final avfg c;
    public static final auci d;
    private static volatile auef e;
    public int a;
    public avga b;

    static {
        avfg avfg = new avfg();
        c = avfg;
        aucj.a(avfg.class, (aucj) avfg);
        amdz amdz = amdz.a;
        avfg avfg2 = c;
        d = aucj.a((audx) amdz, (Object) avfg2, (audx) avfg2, 90015708, aufw.MESSAGE);
    }

    private avfg() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new avfg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avfg.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
