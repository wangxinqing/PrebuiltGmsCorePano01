package defpackage;

/* renamed from: avlj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avlj extends aucj implements audy {
    public static final avlj h;
    private static volatile auef i;
    public int a;
    public int b = 0;
    public Object c;
    public avll d;
    public long e;
    public long f;
    public aufc g;

    static {
        avlj avlj = new avlj();
        h = avlj;
        aucj.a(avlj.class, (aucj) avlj);
    }

    private avlj() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0005\t\u0004\b<\u0000\t<\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", avks.class, avlk.class});
        } else if (i3 == 3) {
            return new avlj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avlj.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
