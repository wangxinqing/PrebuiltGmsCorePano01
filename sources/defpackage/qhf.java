package defpackage;

/* renamed from: qhf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhf extends aucj implements audy {
    public static final qhf g;
    private static volatile auef h;
    public boolean a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public aucx f = auei.b;

    static {
        qhf qhf = new qhf();
        g = qhf;
        aucj.a(qhf.class, (aucj) qhf);
    }

    private qhf() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0007\u0002\u0004\u0003\u0004\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", qhe.class});
        } else if (i2 == 3) {
            return new qhf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (qhf.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
