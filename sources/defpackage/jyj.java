package defpackage;

/* renamed from: jyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jyj extends aucj implements audy {
    public static final jyj l;
    private static volatile auef m;
    public int a;
    public String b = "";
    public aucs c = aucl.b;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;

    static {
        jyj jyj = new jyj();
        l = jyj;
        aucj.a(jyj.class, (aucj) jyj);
    }

    private jyj() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001\b\u0000\u0002\u0016\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0002\u0003\u0006\u0002\u0004\u0007\u0002\u0005\b\u0002\u0006\t\u0002\u0007\n\u0002\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new jyj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (jyj.class) {
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
