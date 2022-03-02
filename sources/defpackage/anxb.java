package defpackage;

/* renamed from: anxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxb extends aucj implements audy {
    public static final anxb l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public long d;
    public anxa e;
    public anwr f;
    public anwy g;
    public anwv h;
    public anwm i;
    public anwt j;
    public long k;

    static {
        anxb anxb = new anxb();
        l = anxb;
        aucj.a(anxb.class, (aucj) anxb);
    }

    private anxb() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0005\t\u0005\u0006\t\u0006\u0007\t\u0007\b\t\b\n\t\n\u000b\t\u000b\f\u0002\u0003\r\u0002\f", new Object[]{"a", "b", "c", anwu.a, "e", "f", "g", "h", "i", "j", "d", "k"});
        } else if (i3 == 3) {
            return new anxb();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (anxb.class) {
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
