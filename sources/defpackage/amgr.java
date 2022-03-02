package defpackage;

/* renamed from: amgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amgr extends aucj implements audy {
    public static final amgr h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public long c;
    public String d = "";
    public String e = "";
    public long f;
    public amfi g;

    static {
        amgr amgr = new amgr();
        h = amgr;
        aucj.a(amgr.class, (aucj) amgr);
    }

    private amgr() {
        auei auei = auei.b;
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\b\u0002\u0002\b\u0003\u0003\b\u0000\u0004\u0002\u0001\u0005\u0002\u0004\u0007\t\u0006", new Object[]{"a", "d", "e", "b", "c", "f", "g"});
        } else if (i3 == 3) {
            return new amgr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (amgr.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
