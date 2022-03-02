package defpackage;

/* renamed from: atmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atmk extends aucj implements audy {
    public static final atmk g;
    private static volatile auef i;
    public int a;
    public float b;
    public float c;
    public int d;
    public int e;
    public int f;
    private int h;

    static {
        atmk atmk = new atmk();
        g = atmk;
        aucj.a(atmk.class, (aucj) atmk);
    }

    private atmk() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"h", "a", atmi.a, "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new atmk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atmk.class) {
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
