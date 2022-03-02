package defpackage;

/* renamed from: atwd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atwd extends aucj implements audy {
    public static final atwd h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public int e;
    public int f;
    public int g;

    static {
        atwd atwd = new atwd();
        h = atwd;
        aucj.a(atwd.class, (aucj) atwd);
    }

    private atwd() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001b\u0004\u0004\u0002\u0005\u0004\u0003\u0006\u0004\u0004", new Object[]{"a", "b", "c", "d", atwc.class, "e", "f", "g"});
        } else if (i3 == 3) {
            return new atwd();
        } else {
            if (i3 == 4) {
                return new aucd((byte[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atwd.class) {
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
