package defpackage;

/* renamed from: arap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arap extends aucj implements audy {
    public static final arap f;
    private static volatile auef g;
    public arbf a;
    public arbd b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        arap arap = new arap();
        f = arap;
        aucj.a(arap.class, (aucj) arap);
    }

    private arap() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0007\u0004\u0007\u0007\u0007", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new arap();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arap.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
