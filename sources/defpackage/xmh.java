package defpackage;

/* renamed from: xmh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xmh extends aucj implements audy {
    public static final xmh o;
    private static volatile auef p;
    public int a;
    public long b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        xmh xmh = new xmh();
        o = xmh;
        aucj.a(xmh.class, (aucj) xmh);
    }

    private xmh() {
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
            return aucj.a((audx) o, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001\u0003\u0000\u0002\u0007\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0004\u000b\r\f\f", new Object[]{"a", "b", "c", "d", "e", xmf.a, "f", "g", "h", "i", "j", "k", "l", "m", "n", xmg.a});
        } else if (i3 == 3) {
            return new xmh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) o);
            }
            if (i3 == 5) {
                return o;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (xmh.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(o);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
