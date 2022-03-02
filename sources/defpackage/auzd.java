package defpackage;

/* renamed from: auzd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auzd extends aucg implements audy {
    public static final auzd c;
    private static volatile auef e;
    public int a;
    public int b;
    private byte d = 2;

    static {
        auzd auzd = new auzd();
        c = auzd;
        aucj.a(auzd.class, (aucj) auzd);
    }

    private auzd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", avap.a});
        } else if (i2 == 3) {
            return new auzd();
        } else {
            if (i2 == 4) {
                return new aucf(c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (auzd.class) {
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
