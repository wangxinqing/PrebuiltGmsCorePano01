package defpackage;

/* renamed from: avvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avvt extends aucj implements audy {
    public static final avvt l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        avvt avvt = new avvt();
        l = avvt;
        aucj.a(avvt.class, (aucj) avvt);
    }

    private avvt() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0002\u0003\f\u0003\u0004\f\u0004\u0005\f\u0005\u0006\f\u0006\u0007\f\u0007\b\f\b\t\f\t\n\f\u0001", new Object[]{"a", "b", avvr.a, "d", avvr.a, "e", avvr.a, "f", avvr.a, "g", avvr.a, "h", avvr.a, "i", avvr.a, "j", avvr.a, "k", avvr.a, "c", avvr.a});
        } else if (i3 == 3) {
            return new avvt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (avvt.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
