package defpackage;

/* renamed from: atln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atln extends aucj implements audy {
    public static final auct f = new atlk();
    public static final atln g;
    private static volatile auef i;
    public int a;
    public double b;
    public double c;
    public long d;
    public aucs e = aucl.b;
    private int h;

    static {
        atln atln = new atln();
        g = atln;
        aucj.a(atln.class, (aucj) atln);
    }

    private atln() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0002\u0003\u0005\u001e", new Object[]{"h", "a", atll.a, "b", "c", "d", "e", attw.b()});
        } else if (i3 == 3) {
            return new atln();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atln.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
