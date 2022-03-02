package defpackage;

/* renamed from: aoaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoaa extends aucj implements audy {
    public static final aoaa m;
    private static volatile auef n;
    public int a;
    public anzy b;
    public aucx c = auei.b;
    public anzr d;
    public anzr e;
    public anyo f;
    public int g;
    public anzs h;
    public anzq i;
    public anzo j;
    public anzt k;
    public aucx l = auei.b;

    static {
        aoaa aoaa = new aoaa();
        m = aoaa;
        aucj.a(aoaa.class, (aucj) aoaa);
    }

    private aoaa() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0004\t\u0002\u0005\t\u0003\u0006\f\u0004\u0007\t\u0005\b\t\u0006\t\t\u0007\n\t\b\u000b\u001b", new Object[]{"a", "b", "c", aoab.class, "d", "e", "f", "g", anzz.a, "h", "i", "j", "k", "l", anzx.class});
        } else if (i3 == 3) {
            return new aoaa();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null, (float[]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aoaa.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
