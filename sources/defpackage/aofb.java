package defpackage;

/* renamed from: aofb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aofb extends aucj implements audy {
    public static final aofb e;
    private static volatile auef f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        aofb aofb = new aofb();
        e = aofb;
        aucj.a(aofb.class, (aucj) aofb);
    }

    private aofb() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\b\f\u0002", new Object[]{"a", "b", aofa.a, "c", "d", aocp.a});
        } else if (i2 == 3) {
            return new aofb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aofb.class) {
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
