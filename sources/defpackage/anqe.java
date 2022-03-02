package defpackage;

/* renamed from: anqe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anqe extends aucj implements audy {
    public static final anqe l;
    private static volatile auef m;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        anqe anqe = new anqe();
        l = anqe;
        aucj.a(anqe.class, (aucj) anqe);
    }

    private anqe() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\u0000\u0001\u0003\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006\u0003\u0005\u0010\u000b\u0006\u0011\u000b\u0007\u0012\u000b\b\u0013\u000b\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new anqe();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (anqe.class) {
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
