package defpackage;

/* renamed from: aobk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aobk extends aucj implements audy {
    public static final aobk e;
    private static volatile auef f;
    public int a;
    public int b;
    public boolean c;
    public long d;

    static {
        aobk aobk = new aobk();
        e = aobk;
        aucj.a(aobk.class, (aucj) aobk);
    }

    private aobk() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\u0002\u0002", new Object[]{"a", "b", aobj.a, "c", "d"});
        } else if (i2 == 3) {
            return new aobk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aobk.class) {
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
