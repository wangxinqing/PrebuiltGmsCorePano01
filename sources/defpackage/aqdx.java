package defpackage;

/* renamed from: aqdx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdx extends aucj implements audy {
    public static final aqdx d;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    public int c = 1;

    static {
        aqdx aqdx = new aqdx();
        d = aqdx;
        aucj.a(aqdx.class, (aucj) aqdx);
    }

    private aqdx() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\f\u0000", new Object[]{"a", "b", aqec.class, "c", aqdl.a});
        } else if (i2 == 3) {
            return new aqdx();
        } else {
            if (i2 == 4) {
                return new aqdw();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqdx.class) {
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