package defpackage;

/* renamed from: apft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apft extends aucj implements audy {
    public static final apft j;
    private static volatile auef l;
    public String a = "";
    public long b;
    public boolean c;
    public double d;
    public String e = "";
    public apfq f;
    public int g;
    public boolean h;
    public int i;
    private int k;

    static {
        apft apft = new apft();
        j = apft;
        aucj.a(apft.class, (aucj) apft);
    }

    private apft() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002\u0004\u0000\u0003\u0005\b\u0004\u0006\t\u0005\u0007\u0007\u0007\b\u0004\b\t\f\u0006", new Object[]{"k", "a", "b", "c", "d", "e", "f", "h", "i", "g", apfr.a});
        } else if (i3 == 3) {
            return new apft();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (apft.class) {
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
