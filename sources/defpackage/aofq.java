package defpackage;

/* renamed from: aofq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aofq extends aucj implements audy {
    public static final aofq c;
    private static volatile auef d;
    public aucx a = auei.b;
    public aucx b = auei.b;

    static {
        aofq aofq = new aofq();
        c = aofq;
        aucj.a(aofq.class, (aucj) aofq);
    }

    private aofq() {
        auei auei = auei.b;
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0002\u0000\u0003\u001b\u0004\u001b", new Object[]{"a", aofr.class, "b", aoct.class});
        } else if (i2 == 3) {
            return new aofq();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aofq.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
