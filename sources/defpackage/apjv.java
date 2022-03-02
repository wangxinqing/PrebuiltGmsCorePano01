package defpackage;

/* renamed from: apjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjv extends aucj implements audy {
    public static final apjv l;
    private static volatile auef n;
    public int a;
    public String b = "";
    public apjx c;
    public apit d;
    public int e;
    public long f;
    public String g = "";
    public String h = "";
    public int i;
    public int j;
    public String k = "";
    private byte m = 2;

    static {
        apjv apjv = new apjv();
        l = apjv;
        aucj.a(apjv.class, (aucj) apjv);
    }

    private apjv() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.m);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.m = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003\u0005\u0002\u0004\u0007\b\u0006\b\b\u0007\t\f\b\n\f\t\u000b\b\n", new Object[]{"a", "b", "c", "d", "e", apix.b(), "f", "g", "h", "i", apjt.a, "j", apjs.a, "k"});
        } else if (i3 == 3) {
            return new apjv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (apjv.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(l);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
