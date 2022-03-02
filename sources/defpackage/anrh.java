package defpackage;

/* renamed from: anrh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anrh extends aucj implements audy {
    public static final anrh f;
    private static volatile auef g;
    public int a;
    public anrr b;
    public int c;
    public anrm d;
    public int e;

    static {
        anrh anrh = new anrh();
        f = anrh;
        aucj.a(anrh.class, (aucj) anrh);
    }

    private anrh() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", anrp.a, "d", "e", anro.a});
        } else if (i2 == 3) {
            return new anrh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (anrh.class) {
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
