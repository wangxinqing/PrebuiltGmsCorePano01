package defpackage;

/* renamed from: atda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atda extends aucj implements audy {
    public static final atda l;
    private static volatile auef m;
    public int a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int h;
    public atbv i;
    public String j = "";
    public boolean k;

    static {
        atda atda = new atda();
        l = atda;
        aucj.a(atda.class, (aucj) atda);
    }

    private atda() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\u0002\u0004\u0005\f\u0005\u0006\b\b\u0007\f\u0003\b\f\u0006\t\u0007\t\n\t\u0007", new Object[]{"a", "b", "c", "d", atcw.a, "f", "g", atcw.a, "j", "e", atcy.a, "h", atcy.a, "k", "i"});
        } else if (i3 == 3) {
            return new atda();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (atda.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
