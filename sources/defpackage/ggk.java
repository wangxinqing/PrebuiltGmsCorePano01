package defpackage;

/* renamed from: ggk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggk extends aucj implements audy {
    public static final ggk h;
    private static volatile auef j;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "/";
    public long e = -1;
    public boolean f;
    public boolean g;
    private int i;

    static {
        ggk ggk = new ggk();
        h = ggk;
        aucj.a(ggk.class, (aucj) ggk);
    }

    private ggk() {
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
            return aucj.a((audx) h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0002\u0004\u0006\u0007\u0005\u0007\u0007\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new ggk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (ggk.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
