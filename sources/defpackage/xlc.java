package defpackage;

/* renamed from: xlc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xlc extends aucj implements audy {
    public static final xlc m;
    private static volatile auef n;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public xkz k;
    public xlb l;

    static {
        xlc xlc = new xlc();
        m = xlc;
        aucj.a(xlc.class, (aucj) xlc);
    }

    private xlc() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0004\u0012\u000b\u0000\u0000\u0000\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\u000b\u0004\n\r\u0007\f\u000e\u0007\r\u0010\u0007\u000f\u0011\t\u0010\u0012\t\u0011", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new xlc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (xlc.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
