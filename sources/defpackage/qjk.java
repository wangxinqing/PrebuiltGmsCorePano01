package defpackage;

/* renamed from: qjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjk extends aucj implements audy {
    public static final qjk c;
    private static volatile auef d;
    public int a = 0;
    public Object b;

    static {
        qjk qjk = new qjk();
        c = qjk;
        aucj.a(qjk.class, (aucj) qjk);
    }

    private qjk() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002Ȼ\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new qjk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (qjk.class) {
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
