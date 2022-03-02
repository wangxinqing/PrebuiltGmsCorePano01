package defpackage;

/* renamed from: aqds  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqds extends aucj implements audy {
    public static final aqds j;
    private static volatile auef l;
    public int a;
    public aucx b = auei.b;
    public int c = 1;
    public aqdz d;
    public aqdq e;
    public int f = 1;
    public String g = "";
    public boolean h;
    public String i = "";
    private byte k = 2;

    static {
        aqds aqds = new aqds();
        j = aqds;
        aucj.a(aqds.class, (aucj) aqds);
    }

    private aqds() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001Л\u0002\f\u0000\u0003\t\u0001\u0004\t\u0002\u0005\f\u0004\u0006\b\u0005\u0007\b\u0007\t\u0007\u0006", new Object[]{"a", "b", aqdi.class, "c", aqdl.a, "d", "e", "f", aqdo.a, "g", "i", "h"});
        } else if (i3 == 3) {
            return new aqds();
        } else {
            if (i3 == 4) {
                return new aqdr();
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqds.class) {
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
