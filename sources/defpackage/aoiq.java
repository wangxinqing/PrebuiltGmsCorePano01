package defpackage;

/* renamed from: aoiq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoiq extends aucj implements audy {
    public static final aoiq i;
    private static volatile auef k;
    public int a;
    public aogc b;
    public String c = "";
    public int d;
    public String e = "";
    public String f = "";
    public String g = "";
    public aoit h;
    private byte j = 2;

    static {
        aoiq aoiq = new aoiq();
        i = aoiq;
        aucj.a(aoiq.class, (aucj) aoiq);
    }

    private aoiq() {
        auei auei = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ԉ\u0000\u0002Ԉ\u0001\u0003Ԅ\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0006\bЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new aoiq();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (aoiq.class) {
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
