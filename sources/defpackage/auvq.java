package defpackage;

/* renamed from: auvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auvq extends aucj implements audy {
    public static final auct b = new auvp();
    public static final auvq e;
    private static volatile auef g;
    public aucs a = aucl.b;
    public auvi c;
    public String d = "";
    private int f;

    static {
        auvq auvq = new auvq();
        e = auvq;
        aucj.a(auvq.class, (aucj) auvq);
    }

    private auvq() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002\t\u0000\u0003\b\u0001", new Object[]{"f", "a", avch.b(), "c", "d"});
        } else if (i2 == 3) {
            return new auvq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auvq.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
