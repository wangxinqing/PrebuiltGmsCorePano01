package defpackage;

/* renamed from: asqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqz extends aucj implements audy {
    public static final asqz e;
    private static volatile auef f;
    public int a;
    public boolean b;
    public aucx c = auei.b;
    public String d = "";

    static {
        asqz asqz = new asqz();
        e = asqz;
        aucj.a(asqz.class, (aucj) asqz);
    }

    private asqz() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u001a\u0003\b\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new asqz();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asqz.class) {
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
