package defpackage;

/* renamed from: nwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nwx extends aucj implements audy {
    public static final nwx j;
    private static volatile auef k;
    public int a;
    public nxb b;
    public aubn c;
    public aubn d;
    public int e;
    public int f;
    public int g;
    public nwv h;
    public int i;

    static {
        nwx nwx = new nwx();
        j = nwx;
        aucj.a(nwx.class, (aucj) nwx);
    }

    private nwx() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003\u0005\f\u0004\b\f\u0006\t\t\u0007\n\u0004\b", new Object[]{"a", "b", "c", "d", "e", nwj.a, "f", nww.a, "g", nxn.b(), "h", "i"});
        } else if (i3 == 3) {
            return new nwx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (nwx.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
