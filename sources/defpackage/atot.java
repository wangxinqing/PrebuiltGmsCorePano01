package defpackage;

/* renamed from: atot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atot extends aucj implements audy {
    public static final atot i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public int e;
    public int f;
    public String g = "";
    public String h = "";

    static {
        atot atot = new atot();
        i = atot;
        aucj.a(atot.class, (aucj) atot);
    }

    private atot() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\b\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", atne.a, "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new atot();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (atot.class) {
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
