package defpackage;

/* renamed from: atcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atcu extends aucj implements audy {
    public static final atcu h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public atcv e;
    public int f;
    public int g;

    static {
        atcu atcu = new atcu();
        h = atcu;
        aucj.a(atcu.class, (aucj) atcu);
    }

    private atcu() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005\f\u0004\u0006\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", atct.a, "g", atcs.a});
        } else if (i3 == 3) {
            return new atcu();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atcu.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
