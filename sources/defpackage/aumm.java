package defpackage;

/* renamed from: aumm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aumm extends aucj implements audy {
    public static final aumm e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public boolean c;
    public int d;

    static {
        aumm aumm = new aumm();
        e = aumm;
        aucj.a(aumm.class, (aucj) aumm);
    }

    private aumm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0000\u0003\u0004\u0001", new Object[]{"a", "b", auml.class, "c", "d"});
        } else if (i2 == 3) {
            return new aumm();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aumm.class) {
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
