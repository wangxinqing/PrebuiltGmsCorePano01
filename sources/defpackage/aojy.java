package defpackage;

/* renamed from: aojy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aojy extends aucj implements audy {
    public static final aojy h;
    private static volatile auef i;
    public int a;
    public aojg b;
    public int c;
    public long d;
    public long e;
    public String f = "";
    public int g;

    static {
        aojy aojy = new aojy();
        h = aojy;
        aucj.a(aojy.class, (aucj) aojy);
    }

    private aojy() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", aomj.a, "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aojy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aojy.class) {
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
