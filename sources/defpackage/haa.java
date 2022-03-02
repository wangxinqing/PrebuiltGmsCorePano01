package defpackage;

/* renamed from: haa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class haa extends aucj implements audy {
    private static volatile auef A;
    public static final haa y;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public aucx m = auei.b;
    public aucx n = auei.b;
    public aucx o = auei.b;
    public aucx p = auei.b;
    public aucx q = auei.b;
    public aucx r = auei.b;
    public int s;
    public boolean t;
    public long u;
    public int v;
    public boolean w;
    public String x = "";
    private byte z = 2;

    static {
        haa haa = new haa();
        y = haa;
        aucj.a(haa.class, (aucj) haa);
    }

    private haa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.z);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.z = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) y, "\u0001\u0017\u0000\u0001\u0001\u001e\u0017\u0000\u0006\b\u0001Ԍ\u0000\u0002Ԍ\u0001\u0003Ԍ\u0002\u0004Ԍ\u0003\u0005ԇ\u0005\u0006ԇ\u0006\u0007Ԅ\u0007\bԄ\n\t\u001a\n\u001a\u000b\u001a\f\u0004\b\r\u0004\t\u000e\u001a\u000f\u001a\u0012\u0004\f\u0013\u0007\r\u0014\u0002\u000e\u0015\u0004\u000f\u001a\u001b\u001c\u0007\u0010\u001d\b\u0011\u001e\f\u0004", new Object[]{"a", "b", gzz.a, "c", gzw.a, "d", gzx.a, "e", gzy.a, "g", "h", "i", "l", "m", "n", "p", "j", "k", "q", "r", "s", "t", "u", "v", "o", hab.class, "w", "x", "f", gzy.a});
        } else if (i3 == 3) {
            return new haa();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) y);
            }
            if (i3 == 5) {
                return y;
            }
            auef auef = A;
            if (auef == null) {
                synchronized (haa.class) {
                    auef = A;
                    if (auef == null) {
                        auef = new auce(y);
                        A = auef;
                    }
                }
            }
            return auef;
        }
    }
}
