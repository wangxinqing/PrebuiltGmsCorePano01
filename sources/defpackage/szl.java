package defpackage;

/* renamed from: szl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szl extends aucj implements audy {
    public static final szl i;
    private static volatile auef j;
    public int a;
    public int b;
    public String c = "";
    public aucx d = auei.b;
    public szp e;
    public boolean f;
    public boolean g;
    public boolean h;

    static {
        szl szl = new szl();
        i = szl;
        aucj.a(szl.class, (aucj) szl);
    }

    private szl() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"a", "b", "c", "d", szm.class, "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new szl();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (int[]) null);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (szl.class) {
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
