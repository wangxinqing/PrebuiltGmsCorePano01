package defpackage;

/* renamed from: avfs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfs extends aucj implements audy {
    public static final avfs c;
    private static volatile auef e;
    public int a;
    public String b = "";
    private int d;

    static {
        avfs avfs = new avfs();
        c = avfs;
        aucj.a(avfs.class, (aucj) avfs);
    }

    private avfs() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new avfs();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avfs.class) {
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
