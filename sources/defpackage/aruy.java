package defpackage;

/* renamed from: aruy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruy extends aucj implements audy {
    public static final aruy i;
    private static volatile auef j;
    public long a;
    public int b;
    public aubn c;
    public aubn d;
    public arvf e;
    public arux f;
    public arvl g;
    public aubn h;

    static {
        aruy aruy = new aruy();
        i = aruy;
        aucj.a(aruy.class, (aucj) aruy);
    }

    private aruy() {
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
            return aucj.a((audx) i, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\t\u0004\t\u0005\t\u0006\t\u0007\t\b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aruy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (aruy.class) {
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
