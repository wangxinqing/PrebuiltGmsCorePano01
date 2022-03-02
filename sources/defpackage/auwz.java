package defpackage;

/* renamed from: auwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwz extends aucj implements audy {
    public static final auwz n;
    private static volatile auef o;
    public int a;
    public int b;
    public int c;
    public auwn d;
    public auwo e;
    public auwt f;
    public auwu g;
    public auwr h;
    public auws i;
    public auwv j;
    public auww k;
    public auwq l;
    public auwm m;

    static {
        auwz auwz = new auwz();
        n = auwz;
        aucj.a(auwz.class, (aucj) auwz);
    }

    private auwz() {
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
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\u000b\t\n\f\t\u000b", new Object[]{"a", "b", avbr.a, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new auwz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (auwz.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(n);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
