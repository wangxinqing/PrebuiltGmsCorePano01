package defpackage;

/* renamed from: qjh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjh extends aucj implements audy {
    public static final qjh e;
    private static volatile auef f;
    public int a = 0;
    public Object b;
    public int c;
    public aucs d = aucl.b;

    static {
        qjh qjh = new qjh();
        e = qjh;
        aucj.a(qjh.class, (aucj) qjh);
    }

    private qjh() {
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
            return aucj.a((audx) e, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0001\u0000\u0001:\u0000\u0002=\u0000\u0003=\u0000\u0004=\u0000\u0005=\u0000\u0007\u0004\b'", new Object[]{"b", "a", "c", "d"});
        } else if (i2 == 3) {
            return new qjh();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (qjh.class) {
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
