package defpackage;

/* renamed from: nxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxb extends aucj implements audy {
    public static final nxb l;
    private static volatile auef m;
    public int a;
    public nxc b;
    public boolean c;
    public boolean d;
    public boolean e;
    public nwq f;
    public nxf g;
    public nwi h;
    public nwz i;
    public long j;
    public long k;

    static {
        nxb nxb = new nxb();
        l = nxb;
        aucj.a(nxb.class, (aucj) nxb);
    }

    private nxb() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\n\u0002\t\u000b\u0002\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new nxb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (nxb.class) {
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
