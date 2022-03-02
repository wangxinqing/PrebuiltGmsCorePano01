package defpackage;

/* renamed from: atay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atay extends aucj implements audy {
    public static final atay j;
    private static volatile auef k;
    public int a;
    public int b;
    public int c;
    public int d;
    public atav e;
    public String f = "";
    public aucx g = auei.b;
    public atau h;
    public auay i = auay.b;

    static {
        atay atay = new atay();
        j = atay;
        aucj.a(atay.class, (aucj) atay);
    }

    private atay() {
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
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\f\u0000\u0002\t\u0003\u0003\u001b\u0004\u0004\u0001\u0005\f\u0002\u0006\t\u0005\u0007\n\u0006\b\b\u0004", new Object[]{"a", "b", atax.a, "e", "g", ataw.class, "c", "d", atas.a, "h", "i", "f"});
        } else if (i3 == 3) {
            return new atay();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (atay.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
