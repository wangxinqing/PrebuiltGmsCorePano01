package defpackage;

/* renamed from: aupi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupi extends aucj implements audy {
    public static final aupi j;
    private static volatile auef l;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public aucx e;
    public aupj f;
    public int g;
    public String h;
    public ansh i;
    private byte k = 2;

    static {
        aupi aupi = new aupi();
        j = aupi;
        aucj.a(aupi.class, (aucj) aupi);
    }

    private aupi() {
        auei auei = auei.b;
        this.e = auei.b;
        this.h = "";
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0002\u0001ԅ\u0000\u0002\b\u0001\u0003\b\u0002\u0005\u001a\u0006Љ\u0003\u0007\u0004\u0004\b\b\u0005\t\t\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new aupi();
        } else {
            if (i3 == 4) {
                return new aucd((int[][][]) null, (byte[][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aupi.class) {
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
