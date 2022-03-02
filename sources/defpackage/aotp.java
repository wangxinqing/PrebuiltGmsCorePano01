package defpackage;

/* renamed from: aotp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aotp extends aucj implements audy {
    public static final aotp f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public String c = "";
    public aucx d = auei.b;
    public String e = "";

    static {
        aotp aotp = new aotp();
        f = aotp;
        aucj.a(aotp.class, (aucj) aotp);
    }

    private aotp() {
        auei auei = auei.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0000\u0002\u0007\u0000\u0003\b\u0001\u0004\u001c\u0005\b\u0002", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aotp();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aotp.class) {
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
