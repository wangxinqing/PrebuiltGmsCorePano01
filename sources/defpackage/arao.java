package defpackage;

/* renamed from: arao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arao extends aucj implements audy {
    public static final arao e;
    private static volatile auef f;
    public int a = 0;
    public Object b;
    public int c;
    public aucs d = aucl.b;

    static {
        arao arao = new arao();
        e = arao;
        aucj.a(arao.class, (aucj) arao);
    }

    private arao() {
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
            return aucj.a((audx) e, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001:\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000\u0005=\u0000\u0006\u0004\u0007'", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new arao();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arao.class) {
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
