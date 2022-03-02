package defpackage;

/* renamed from: avih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avih extends aucj implements audy {
    public static final avih d;
    private static volatile auef f;
    public String a = "";
    public aucx b = auei.b;
    public String c = "";
    private int e;

    static {
        avih avih = new avih();
        d = avih;
        aucj.a(avih.class, (aucj) avih);
    }

    private avih() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0001\u0000\u0002\b\u0001\u0003\u001b\u0005\b\u0003", new Object[]{"e", "a", "b", avii.class, "c"});
        } else if (i2 == 3) {
            return new avih();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avih.class) {
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
