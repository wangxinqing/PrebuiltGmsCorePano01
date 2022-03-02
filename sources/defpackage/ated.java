package defpackage;

/* renamed from: ated  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ated extends aucj implements audy {
    public static final ated g;
    private static volatile auef i;
    public int a;
    public boolean b;
    public boolean c;
    public String d = "";
    public long e;
    public long f;
    private int h;

    static {
        ated ated = new ated();
        g = ated;
        aucj.a(ated.class, (aucj) ated);
    }

    private ated() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\b\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new ated();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ated.class) {
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
