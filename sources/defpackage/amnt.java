package defpackage;

/* renamed from: amnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amnt extends aucj implements audy {
    public static final amnt e;
    private static volatile auef i;
    public amnd a;
    public aucx b = auei.b;
    public int c;
    public amnh d;
    private int f;
    private String g = "";
    private byte h = 2;

    static {
        amnt amnt = new amnt();
        e = amnt;
        aucj.a(amnt.class, (aucj) amnt);
    }

    private amnt() {
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
            return aucj.a((audx) e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0003\u0001Ԉ\u0000\u0003Љ\u0002\u0004Л\u0006\u0004\u0004\u0007\t\u0005", new Object[]{"f", "g", "a", "b", amnv.class, "c", "d"});
        } else if (i3 == 3) {
            return new amnt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) e);
            }
            if (i3 == 5) {
                return e;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (amnt.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(e);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
