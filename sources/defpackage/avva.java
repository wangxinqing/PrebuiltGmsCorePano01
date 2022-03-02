package defpackage;

/* renamed from: avva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avva extends aucj implements audy {
    public static final avva g;
    private static volatile auef h;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public long e;
    public long f;

    static {
        avva avva = new avva();
        g = avva;
        aucj.a(avva.class, (aucj) avva);
    }

    private avva() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0003\u0000\u0001\u001b\u0003\u0002\u0001\u0004\u0002\u0002\t\u001b\n\u001b", new Object[]{"a", "b", avuz.class, "e", "f", "c", avuz.class, "d", avuz.class});
        } else if (i2 == 3) {
            return new avva();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avva.class) {
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
