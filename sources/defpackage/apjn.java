package defpackage;

/* renamed from: apjn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjn extends aucj implements audy {
    public static final apjn j;
    private static volatile auef l;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public int e;
    public apkp f;
    public int g;
    public aucx h = auei.b;
    public aucx i = auei.b;
    private byte k = 2;

    static {
        apjn apjn = new apjn();
        j = apjn;
        aucj.a(apjn.class, (aucj) apjn);
    }

    private apjn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.k = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0002\u0002\u0002\b\u0001\u0003\u0007\u0002\u0004\f\u0003\u0005\f\u0004\u0006\t\u0005\u0007\u0004\u0006\bЛ\tЛ", new Object[]{"a", "b", "c", "d", apix.b(), "e", apim.a, "f", "g", "h", apis.class, "i", apjv.class});
        } else if (i3 == 3) {
            return new apjn();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (apjn.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(j);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
