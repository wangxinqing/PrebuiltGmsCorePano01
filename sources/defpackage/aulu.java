package defpackage;

/* renamed from: aulu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aulu extends aucj implements audy {
    public static final aulu f;
    private static volatile auef h;
    public aukh a;
    public String b = "";
    public auay c = auay.b;
    public boolean d;
    public boolean e;
    private int g;

    static {
        aulu aulu = new aulu();
        f = aulu;
        aucj.a(aulu.class, (aucj) aulu);
    }

    private aulu() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aulu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aulu.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
