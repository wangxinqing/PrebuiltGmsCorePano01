package defpackage;

/* renamed from: avhk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhk extends aucj implements audy {
    public static final avhk c;
    private static volatile auef e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        avhk avhk = new avhk();
        c = avhk;
        aucj.a(avhk.class, (aucj) avhk);
    }

    private avhk() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new avhk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avhk.class) {
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
