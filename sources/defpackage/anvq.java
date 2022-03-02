package defpackage;

/* renamed from: anvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anvq extends aucj implements audy {
    public static final anvq e;
    private static volatile auef f;
    public int a;
    public boolean b;
    public int c;
    public aucs d = aucl.b;

    static {
        anvq anvq = new anvq();
        e = anvq;
        aucj.a(anvq.class, (aucj) anvq);
    }

    private anvq() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0004\u0016", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new anvq();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (anvq.class) {
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
