package defpackage;

/* renamed from: aozl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aozl extends aucj implements audy {
    public static final aozl i;
    private static volatile auef j;
    public int a;
    public aozm b;
    public auay c = auay.b;
    public auay d = auay.b;
    public auay e = auay.b;
    public auay f = auay.b;
    public auay g = auay.b;
    public auay h = auay.b;

    static {
        aozl aozl = new aozl();
        i = aozl;
        aucj.a(aozl.class, (aucj) aozl);
    }

    private aozl() {
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aozl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aozl.class) {
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
