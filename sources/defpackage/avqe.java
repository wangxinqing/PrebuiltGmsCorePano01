package defpackage;

/* renamed from: avqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqe extends aucj implements audy {
    public static final avqe f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public int c;
    public String d = "";
    public aucx e = auei.b;

    static {
        avqe avqe = new avqe();
        f = avqe;
        aucj.a(avqe.class, (aucj) avqe);
    }

    private avqe() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", avqg.class});
        } else if (i2 == 3) {
            return new avqe();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avqe.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
