package defpackage;

/* renamed from: afth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afth extends aucj implements audy {
    public static final afth k;
    private static volatile auef l;
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public aucx i = auei.b;
    public int j;

    static {
        afth afth = new afth();
        k = afth;
        aucj.a(afth.class, (aucj) afth);
    }

    private afth() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\f\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0002\u0003\u0006\u0004\u0004\u0007\u0004\u0005\b\u0007\u0006\t\u001b\n\f\u0007", new Object[]{"a", "b", aftf.a, "c", "d", "e", "f", "g", "h", "i", aftg.class, "j", afuh.a});
        } else if (i3 == 3) {
            return new afth();
        } else {
            if (i3 == 4) {
                return new aucd((boolean[][][]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (afth.class) {
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
