package defpackage;

/* renamed from: aokn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokn extends aucj implements audy {
    public static final aokn g;
    private static volatile auef h;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public boolean f;

    static {
        aokn aokn = new aokn();
        g = aokn;
        aucj.a(aokn.class, (aucj) aokn);
    }

    private aokn() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0003\t\u0005\u0000\u0000\u0000\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004\b\u0003\u0006\t\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aokn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aokn.class) {
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
