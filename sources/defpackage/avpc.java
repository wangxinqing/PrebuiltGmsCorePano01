package defpackage;

/* renamed from: avpc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avpc extends aucj implements audy {
    public static final avpc e;
    private static volatile auef f;
    public int a;
    public aqdv b;
    public avoy c;
    public aucx d = auei.b;

    static {
        avpc avpc = new avpc();
        e = avpc;
        aucj.a(avpc.class, (aucj) avpc);
    }

    private avpc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", avpd.class});
        } else if (i2 == 3) {
            return new avpc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avpc.class) {
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
