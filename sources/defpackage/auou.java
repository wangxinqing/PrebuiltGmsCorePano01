package defpackage;

/* renamed from: auou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auou extends aucj implements audy {
    public static final auou i;
    private static volatile auef k;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";
    private byte j = 2;

    static {
        auou auou = new auou();
        i = auou;
        aucj.a(auou.class, (aucj) auou);
    }

    private auou() {
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
            return aucj.a((audx) i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001Ԉ\u0000\u0002\b\u0001\u0003Ԉ\u0002\u0004Ԅ\u0003\u0005Ԉ\u0004\u0006Ԉ\u0005\u0007Ԉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
        } else if (i3 == 3) {
            return new auou();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) i);
            }
            if (i3 == 5) {
                return i;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (auou.class) {
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
