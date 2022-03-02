package defpackage;

/* renamed from: aquk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aquk extends aucj implements audy {
    public static final aquk c;
    private static volatile auef e;
    public int a = 0;
    public Object b;
    private byte d = 2;

    static {
        aquk aquk = new aquk();
        c = aquk;
        aucj.a(aquk.class, (aucj) aquk);
    }

    private aquk() {
        auei auei = auei.b;
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
            return aucj.a((audx) c, "\u0000\u0003\u0001\u0000\u0004\b\u0003\u0000\u0000\u0001\u0004м\u0000\u0005<\u0000\b<\u0000", new Object[]{"b", "a", amgi.class, aqvu.class, avkw.class});
        } else if (i2 == 3) {
            return new aquk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aquk.class) {
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
