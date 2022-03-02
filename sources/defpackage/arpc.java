package defpackage;

/* renamed from: arpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpc extends aucj implements audy {
    public static final arpc c;
    private static volatile auef e;
    public long a;
    public aucx b = auei.b;
    private int d;

    static {
        arpc arpc = new arpc();
        c = arpc;
        aucj.a(arpc.class, (aucj) arpc);
    }

    private arpc() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0000\u0002\u001b", new Object[]{"d", "a", "b", arou.class});
        } else if (i2 == 3) {
            return new arpc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arpc.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
