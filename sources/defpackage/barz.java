package defpackage;

/* renamed from: barz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class barz extends aucj implements audy {
    public static final barz m;
    private static volatile auef o;
    public int a;
    public String b = "";
    public long c;
    public String d = "";
    public long e;
    public long f;
    public long g;
    public long h;
    public int i;
    public long j;
    public int k;
    public barb l;
    private byte n = 2;

    static {
        barz barz = new barz();
        m = barz;
        aucj.a(barz.class, (aucj) barz);
    }

    private barz() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.n);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.n = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0001\u0001\b\u0000\u0002\u0005\u0003\u0003\u0005\u0004\u0004\u0002\u0005\u0005\u0002\u0006\u0006\u0002\b\u0007\f\t\b\u0005\u0001\t\b\u0002\n\u0004\u0007\u000bЉ\n", new Object[]{"a", "b", "e", "f", "g", "h", "j", "k", barx.a, "c", "d", "i", "l"});
        } else if (i3 == 3) {
            return new barz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (barz.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(m);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
