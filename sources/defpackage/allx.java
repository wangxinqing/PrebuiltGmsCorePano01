package defpackage;

/* renamed from: allx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class allx extends aucj implements audy {
    public static final allx g;
    private static volatile auef k;
    public String a = "";
    public aucx b = auei.b;
    public boolean c;
    public String d = "";
    public boolean e;
    public aucx f = auei.b;
    private int h;
    private String i = "";
    private byte j = 2;

    static {
        allx allx = new allx();
        g = allx;
        aucj.a(allx.class, (aucj) allx);
    }

    private allx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\u001a\u0004\u0007\u0002\u0005\b\u0003\u0006\u0007\u0004\t\u001a", new Object[]{"h", "i", "a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new allx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (allx.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(g);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
