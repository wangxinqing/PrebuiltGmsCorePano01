package defpackage;

/* renamed from: gzg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzg extends aucj implements audy {
    public static final gzg k;
    private static volatile auef l;
    public int a;
    public int b;
    public long c;
    public long d;
    public int e;
    public int f;
    public gzn g;
    public aucx h = auei.b;
    public gzm i;
    public boolean j;

    static {
        gzg gzg = new gzg();
        k = gzg;
        aucj.a(gzg.class, (aucj) gzg);
    }

    private gzg() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002\f\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\f\u0003\u0006\f\u0004\u0007\t\u0005\b\u001b\t\t\u0006\n\u0007\u0007", new Object[]{"a", "b", gzf.a, "c", "d", "e", gze.a, "f", gzd.a, "g", "h", gzb.class, "i", "j"});
        } else if (i3 == 3) {
            return new gzg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (gzg.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
