package defpackage;

/* renamed from: arbe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbe extends aucj implements audy {
    public static final arbe e;
    private static volatile auef f;
    public avwp a;
    public String b = "";
    public long c;
    public auay d = auay.b;

    static {
        arbe arbe = new arbe();
        e = arbe;
        aucj.a(arbe.class, (aucj) arbe);
    }

    private arbe() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002Ȉ\u0003\u0002\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new arbe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arbe.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
