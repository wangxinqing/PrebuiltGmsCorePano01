package defpackage;

/* renamed from: ggo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggo extends aucj implements audy {
    public static final ggo i;
    private static volatile auef k;
    public String a = "";
    public String b = "";
    public boolean c;
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    private int j;

    static {
        ggo ggo = new ggo();
        i = ggo;
        aucj.a(ggo.class, (aucj) ggo);
    }

    private ggo() {
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
            return aucj.a((audx) i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\b\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new ggo();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (ggo.class) {
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
