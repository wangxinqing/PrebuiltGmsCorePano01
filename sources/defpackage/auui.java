package defpackage;

/* renamed from: auui  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auui extends aucj implements audy {
    public static final auui b;
    private static volatile auef d;
    public String a = "";
    private int c;

    static {
        auui auui = new auui();
        b = auui;
        aucj.a(auui.class, (aucj) auui);
    }

    private auui() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new auui();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (auui.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
