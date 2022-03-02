package defpackage;

/* renamed from: auzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auzx extends aucg implements audy {
    public static final auzx f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public auzc c;
    public auzr d;
    public avaj e;
    private byte g = 2;

    static {
        auzx auzx = new auzx();
        f = auzx;
        aucj.a(auzx.class, (aucj) auzx);
    }

    private auzx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\t\u0002\u0005\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new auzx();
        } else {
            if (i2 == 4) {
                return new aucf(f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auzx.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
