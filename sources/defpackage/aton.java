package defpackage;

/* renamed from: aton  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aton extends aucj implements audy {
    public static final aton n;
    private static volatile auef o;
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
    public int l;
    public int m;

    static {
        aton aton = new aton();
        n = aton;
        aucj.a(aton.class, (aucj) aton);
    }

    private aton() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0000\u0000\u0001\f\u0000\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0004\u000b\r\u0004\f\u000e\u0004\r", new Object[]{"a", "b", atjv.b(), "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new aton();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (aton.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
