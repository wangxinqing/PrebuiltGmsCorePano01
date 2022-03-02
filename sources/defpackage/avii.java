package defpackage;

/* renamed from: avii  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avii extends aucj implements audy {
    public static final avii i;
    private static volatile auef k;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    private int j;

    static {
        avii avii = new avii();
        i = avii;
        aucj.a(avii.class, (aucj) avii);
    }

    private avii() {
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
            return aucj.a((audx) i, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\n\b\t\u000b\b\n", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new avii();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avii.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(i);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
