package defpackage;

/* renamed from: atce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atce extends aucj implements audy {
    public static final atce l;
    private static volatile auef m;
    public int a;
    public boolean b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean e;
    public boolean f = true;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;

    static {
        atce atce = new atce();
        l = atce;
        aucj.a(atce.class, (aucj) atce);
    }

    private atce() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\f\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\u0004\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", atcc.a, "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new atce();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (atce.class) {
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
