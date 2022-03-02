package defpackage;

/* renamed from: wly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wly extends aucj implements audy {
    public static final wly g;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public boolean e;
    public aucx f = auei.b;
    private int h;

    static {
        wly wly = new wly();
        g = wly;
        aucj.a(wly.class, (aucj) wly);
    }

    private wly() {
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
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0000\u0001\f\u0000\u0004\u001a\u0005\u001a\u0006\u001a\u0007\u0007\u0001\b\u001a", new Object[]{"h", "a", wmb.b(), "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new wly();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (wly.class) {
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
