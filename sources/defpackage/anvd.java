package defpackage;

/* renamed from: anvd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anvd extends aucj implements audy {
    public static final anvd g;
    private static volatile auef i;
    public int a;
    public anvb b;
    public anvc c;
    public anva d;
    public anuz e;
    public anve f;
    private byte h = 2;

    static {
        anvd anvd = new anvd();
        g = anvd;
        aucj.a(anvd.class, (aucj) anvd);
    }

    private anvd() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new anvd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (anvd.class) {
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
