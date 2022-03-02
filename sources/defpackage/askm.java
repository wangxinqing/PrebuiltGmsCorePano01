package defpackage;

/* renamed from: askm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askm extends aucj implements audy {
    public static final askm h;
    private static volatile auef i;
    public int a;
    public long b;
    public int c;
    public long d;
    public long e;
    public int f;
    public int g;

    static {
        askm askm = new askm();
        h = askm;
        aucj.a(askm.class, (aucj) askm);
    }

    private askm() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0004\u0004\u0006\f\u0005", new Object[]{"a", "b", "c", asoh.a, "d", "e", "f", "g", asog.b()});
        } else if (i3 == 3) {
            return new askm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (askm.class) {
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
