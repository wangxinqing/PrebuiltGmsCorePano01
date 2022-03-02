package defpackage;

/* renamed from: aoyq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoyq extends aucj implements audy {
    public static final aoyq d;
    private static volatile auef e;
    public int a;
    public aoys b;
    public auay c = auay.b;

    static {
        aoyq aoyq = new aoyq();
        d = aoyq;
        aucj.a(aoyq.class, (aucj) aoyq);
    }

    private aoyq() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aoyq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aoyq.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
