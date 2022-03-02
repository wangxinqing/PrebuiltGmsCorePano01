package defpackage;

/* renamed from: amnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amnn extends aucj implements audy {
    public static final amnn g;
    private static volatile auef j;
    public int a;
    public int b;
    public String c = "";
    public amne d;
    public int e;
    public long f;
    private amnd h;
    private byte i = 2;

    static {
        amnn amnn = new amnn();
        g = amnn;
        aucj.a(amnn.class, (aucj) amnn);
    }

    private amnn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0002\f\u0006\u0000\u0000\u0004\u0002Ԍ\u0001\u0003Ԉ\u0002\u0006Љ\u0005\u0007Љ\u0006\n\u0004\t\f\u0002\u000b", new Object[]{"a", "b", amnm.a, "c", "h", "d", "e", "f"});
        } else if (i3 == 3) {
            return new amnn();
        } else {
            if (i3 == 4) {
                return new amnl();
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (amnn.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(g);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
