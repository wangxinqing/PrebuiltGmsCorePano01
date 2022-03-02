package defpackage;

/* renamed from: aupn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupn extends aucj implements audy {
    public static final aupn d;
    private static volatile auef f;
    public aupl a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;

    static {
        aupn aupn = new aupn();
        d = aupn;
        aucj.a(aupn.class, (aucj) aupn);
    }

    private aupn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        Class<aupn> cls = aupn.class;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0000\u0002\t\u0000\u0003\u001b\u0004\u001b", new Object[]{"e", "a", "b", aupm.class, "c", cls});
        } else if (i2 == 3) {
            return new aupn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (cls) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
