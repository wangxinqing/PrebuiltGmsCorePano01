package defpackage;

/* renamed from: auxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auxh extends aucj implements audy {
    public static final auxh f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public String e = "";

    static {
        auxh auxh = new auxh();
        f = auxh;
        aucj.a(auxh.class, (aucj) auxh);
    }

    private auxh() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", avby.a, "e"});
        } else if (i2 == 3) {
            return new auxh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auxh.class) {
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
