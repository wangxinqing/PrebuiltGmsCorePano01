package defpackage;

/* renamed from: xmw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xmw extends aucj implements audy {
    public static final xmw l;
    private static volatile auef m;
    public int a;
    public xoa b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public String j = "";
    public boolean k;

    static {
        xmw xmw = new xmw();
        l = xmw;
        aucj.a(xmw.class, (aucj) xmw);
    }

    private xmw() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\t\u0000\u0002\u0004\u0001\u0003\u0002\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0006\u0007\u0007\u0005\b\u0007\u0007\t\b\b\n\u0007\t", new Object[]{"a", "b", "c", "d", "e", "f", "h", "g", "i", "j", "k"});
        } else if (i3 == 3) {
            return new xmw();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (xmw.class) {
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
