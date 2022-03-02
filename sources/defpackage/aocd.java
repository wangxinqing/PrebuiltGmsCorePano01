package defpackage;

/* renamed from: aocd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aocd extends aucj implements audy {
    public static final aocd k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public aucx h = auei.b;
    public int i;
    public int j;

    static {
        aocd aocd = new aocd();
        k = aocd;
        aucj.a(aocd.class, (aucj) aocd);
    }

    private aocd() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0007\u0004\u0006\t\u001b\u000b\f\t\f\u0004\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", aocc.class, "i", aobo.a, "j"});
        } else if (i3 == 3) {
            return new aocd();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (short[][]) null);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aocd.class) {
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
