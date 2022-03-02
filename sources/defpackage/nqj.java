package defpackage;

/* renamed from: nqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nqj extends aucj implements audy {
    public static final nqj k;
    private static volatile auef l;
    public int a;
    public String b = "";
    public long c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public long i;
    public nqo j;

    static {
        nqj nqj = new nqj();
        k = nqj;
        aucj.a(nqj.class, (aucj) nqj);
    }

    private nqj() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0002\u0003\u0002\u0001\u0004\u0007\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0010\u0007\t\t\b", new Object[]{"a", "b", "d", "c", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new nqj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (nqj.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
