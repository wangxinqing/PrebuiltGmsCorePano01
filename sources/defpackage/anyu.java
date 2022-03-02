package defpackage;

/* renamed from: anyu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anyu extends aucj implements audy {
    public static final anyu f;
    private static volatile auef h;
    public int a;
    public int b = 1;
    public anyv c;
    public anyw d;
    public artq e;
    private byte g = 2;

    static {
        anyu anyu = new anyu();
        f = anyu;
        aucj.a(anyu.class, (aucj) anyu);
    }

    private anyu() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004Љ\u0003", new Object[]{"a", "b", anyt.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new anyu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anyu.class) {
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
