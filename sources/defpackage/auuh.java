package defpackage;

/* renamed from: auuh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auuh extends aucj implements audy {
    public static final auuh h;
    private static volatile auef i;
    public int a;
    public auul b;
    public String c = "";
    public String d = "";
    public boolean e;
    public String f = "";
    public String g = "";

    static {
        auuh auuh = new auuh();
        h = auuh;
        aucj.a(auuh.class, (aucj) auuh);
    }

    private auuh() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0001\u0002\t\u0000\u0003\u0007\u0003\u0004\b\u0002\u0005\b\u0004\u0006\b\u0005", new Object[]{"a", "c", "b", "e", "d", "f", "g"});
        } else if (i3 == 3) {
            return new auuh();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (auuh.class) {
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
