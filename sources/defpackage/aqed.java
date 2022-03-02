package defpackage;

/* renamed from: aqed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqed extends aucj implements audy {
    public static final aqed g;
    private static volatile auef h;
    public int a;
    public boolean b;
    public boolean c;
    public int d = 1;
    public long e;
    public long f;

    static {
        aqed aqed = new aqed();
        g = aqed;
        aucj.a(aqed.class, (aucj) aqed);
    }

    private aqed() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004", new Object[]{"a", "b", "c", "d", aqea.a, "e", "f"});
        } else if (i2 == 3) {
            return new aqed();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqed.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
