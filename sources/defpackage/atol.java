package defpackage;

/* renamed from: atol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atol extends aucj implements audy {
    public static final atol h;
    private static volatile auef i;
    public int a;
    public aucx b = auei.b;
    public atos c;
    public atop d;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public aucx g = auei.b;

    static {
        atol atol = new atol();
        h = atol;
        aucj.a(atol.class, (aucj) atol);
    }

    private atol() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0000\u0001\u001b\u0002\t\u0000\u0005\t\u0002\u0006\u001b\u0007\u001b\b\u001b", new Object[]{"a", "b", ator.class, "c", "d", "e", atok.class, "f", jyk.class, "g", atom.class});
        } else if (i3 == 3) {
            return new atol();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (char[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atol.class) {
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
