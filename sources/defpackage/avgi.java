package defpackage;

/* renamed from: avgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avgi extends aucj implements audy {
    public static final avgi d;
    private static volatile auef e;
    public int a;
    public String b = "";
    public aucx c = auei.b;

    static {
        avgi avgi = new avgi();
        d = avgi;
        aucj.a(avgi.class, (aucj) avgi);
    }

    private avgi() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\b\u0000\u0003\u001b", new Object[]{"a", "b", "c", avgs.class});
        } else if (i2 == 3) {
            return new avgi();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avgi.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
