package defpackage;

/* renamed from: aoak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoak extends aucj implements audy {
    public static final aoak h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aucx g = auei.b;

    static {
        aoak aoak = new aoak();
        h = aoak;
        aucj.a(aoak.class, (aucj) aoak);
    }

    private aoak() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", aoaj.class});
        } else if (i3 == 3) {
            return new aoak();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aoak.class) {
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
