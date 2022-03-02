package defpackage;

/* renamed from: avsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsp extends aucj implements audy {
    public static final avsp d;
    private static volatile auef f;
    public long a = 1048576;
    public aucx b = auei.b;
    public boolean c;
    private int e;

    static {
        avsp avsp = new avsp();
        d = avsp;
        aucj.a(avsp.class, (aucj) avsp);
    }

    private avsp() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b\u0003\u0007\u0001", new Object[]{"e", "a", "b", avso.class, "c"});
        } else if (i2 == 3) {
            return new avsp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avsp.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
