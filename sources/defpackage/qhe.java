package defpackage;

/* renamed from: qhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhe extends aucj implements audy {
    public static final qhe g;
    private static volatile auef h;
    public String a = "";
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public float f;

    static {
        qhe qhe = new qhe();
        g = qhe;
        aucj.a(qhe.class, (aucj) qhe);
    }

    private qhe() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0004\u0005\u0007\u0006\u0001", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new qhe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (qhe.class) {
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
