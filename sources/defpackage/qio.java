package defpackage;

/* renamed from: qio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qio extends aucj implements audy {
    public static final qio e;
    private static volatile auef f;
    public String a = "";
    public String b = "";
    public String c = "";
    public qir d;

    static {
        qio qio = new qio();
        e = qio;
        aucj.a(qio.class, (aucj) qio);
    }

    private qio() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new qio();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (qio.class) {
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
