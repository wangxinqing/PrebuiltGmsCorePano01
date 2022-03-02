package defpackage;

/* renamed from: avfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfj extends aucj implements audy {
    public static final avfj n;
    public static final auci o;
    private static volatile auef p;
    public int a;
    public avgg b;
    public aucx c = auei.b;
    public avgh d;
    public avfe e;
    public aucx f = auei.b;
    public avgl g;
    public avgi h;
    public avgw i;
    public avfz j;
    public avgc k;
    public avgb l;
    public avgt m;

    static {
        avfj avfj = new avfj();
        n = avfj;
        aucj.a(avfj.class, (aucj) avfj);
        amdy amdy = amdy.a;
        avfj avfj2 = n;
        o = aucj.a((audx) amdy, (Object) avfj2, (audx) avfj2, 71464408, aufw.MESSAGE);
    }

    private avfj() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0004\t\u0002\u0005\u001b\u0006\t\u0003\u0007\t\u0004\b\t\u0005\t\t\u0006\n\t\u0007\f\t\b\r\t\t", new Object[]{"a", "b", "c", avgm.class, "d", "e", "f", avfe.class, "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new avfj();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][][]) null, (float[][][]) null);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (avfj.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(n);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
