package defpackage;

/* renamed from: otl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class otl extends aucj implements audy {
    public static final otl j;
    private static volatile auef k;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public String g = "";
    public String h = "";
    public String i = "";

    static {
        otl otl = new otl();
        j = otl;
        aucj.a(otl.class, (aucj) otl);
    }

    private otl() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0002\u0003\u0004\u0003\u0004\u0004\u0004\u0005\b\u0005\u0006\b\u0006\u0007\b\u0007\b\b\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "c"});
        } else if (i3 == 3) {
            return new otl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (otl.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
