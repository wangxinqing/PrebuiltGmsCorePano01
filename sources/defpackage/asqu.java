package defpackage;

/* renamed from: asqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqu extends aucj implements audy {
    public static final asqu i;
    private static volatile auef j;
    public int a;
    public asuu b;
    public aucx c = auei.b;
    public String d = "";
    public String e = "";
    public String f = "";
    public avoq g;
    public String h = "";

    static {
        asqu asqu = new asqu();
        i = asqu;
        aucj.a(asqu.class, (aucj) asqu);
    }

    private asqu() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\t\u0000\u0002\u001a\u0003\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\t\u0004\u0007\b\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new asqu();
        } else {
            if (i3 == 4) {
                return new aucd((int[]) null, (float[][][]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (asqu.class) {
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
