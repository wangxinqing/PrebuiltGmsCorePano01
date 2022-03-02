package defpackage;

/* renamed from: lyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lyd extends aucj implements audy {
    public static final lyd p;
    private static volatile auef r;
    public int a;
    public lyj b;
    public aucx c = auei.b;
    public String d = "";
    public String e = "";
    public int f;
    public boolean g;
    public boolean h;
    public aucx i = auei.b;
    public auay j = auay.b;
    public int k;
    public int l;
    public lyi m;
    public lyk n;
    public int o = 2;
    private boolean q;

    static {
        lyd lyd = new lyd();
        p = lyd;
        aucj.a(lyd.class, (aucj) lyd);
    }

    private lyd() {
    }

    public static /* synthetic */ void a(lyd lyd) {
        lyd.a |= 64;
        lyd.q = true;
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
            return aucj.a((audx) p, "\u0001\u000f\u0000\u0001\u0001\u0017\u000f\u0000\u0002\u0000\u0001\t\u0000\u0002\u001b\u0003\b\u0002\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006\t\u001c\n\n\u0007\u000b\u000b\b\f\t\n\r\u0004\u0003\u000e\b\u0001\u0011\u000b\t\u0012\t\u000b\u0017\f\f", new Object[]{"a", "b", "c", lyf.class, "e", "g", "h", "q", "i", "j", "k", "m", "f", "d", "l", "n", "o", lyb.a});
        } else if (i3 == 3) {
            return new lyd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (lyd.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(p);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
