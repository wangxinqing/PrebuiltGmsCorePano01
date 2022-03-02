package defpackage;

/* renamed from: atzv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzv extends aucj implements audy {
    public static final atzv i;
    private static volatile auef j;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public String e = "";
    public atzt f;
    public atzs g;
    public atzu h;

    static {
        atzv atzv = new atzv();
        i = atzv;
        aucj.a(atzv.class, (aucj) atzv);
    }

    private atzv() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\b\u0000\u0003\u0004\u0002\u0004\b\u0003\u0005\b\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new atzv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (atzv.class) {
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
