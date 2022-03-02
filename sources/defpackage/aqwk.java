package defpackage;

/* renamed from: aqwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwk extends aucj implements audy {
    public static final aqwk g;
    private static volatile auef i;
    public aucx a = auei.b;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public aquj f;
    private byte h = 2;

    static {
        aqwk aqwk = new aqwk();
        g = aqwk;
        aucj.a(aqwk.class, (aucj) aqwk);
    }

    private aqwk() {
        aucl aucl = aucl.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0001\u0001\u0001Л\u0002Ȉ\u0003Ȉ\u0004\u0004\u0006\u0004\u0007\t", new Object[]{"a", amgi.class, "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new aqwk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqwk.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
