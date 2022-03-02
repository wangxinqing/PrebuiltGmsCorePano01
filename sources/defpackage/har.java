package defpackage;

/* renamed from: har  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class har extends aucj implements audy {
    public static final har i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aucs e = aucl.b;
    public String f = "";
    public String g = "";
    public auay h = auay.b;

    static {
        har har = new har();
        i = har;
        aucj.a(har.class, (aucj) har);
    }

    private har() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001e\u0006\b\u0004\u0007\b\u0005\b\n\u0006", new Object[]{"a", "b", "c", "d", "e", haq.b(), "f", "g", "h"});
        } else if (i3 == 3) {
            return new har();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (har.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(i);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
