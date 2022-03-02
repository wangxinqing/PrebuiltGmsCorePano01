package defpackage;

/* renamed from: atop  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atop extends aucj implements audy {
    public static final atop m;
    private static volatile auef n;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public aucx l = auei.b;

    static {
        atop atop = new atop();
        m = atop;
        aucj.a(atop.class, (aucj) atop);
    }

    private atop() {
        auei auei = auei.b;
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0007\u0002\u0004\b\u0002\u0005\t\u0002\u0006\n\u0002\u0007\u000b\u0002\b\f\u0002\t\r\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", aton.class});
        } else if (i3 == 3) {
            return new atop();
        } else {
            if (i3 == 4) {
                return new aucd((float[]) null, (float[]) null);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (atop.class) {
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
