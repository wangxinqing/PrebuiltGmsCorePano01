package defpackage;

/* renamed from: clz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clz extends aucj implements audy {
    public static final clz h;
    private static volatile auef i;
    public int a = 0;
    public Object b;
    public long c;
    public int d;
    public long e;
    public long f;
    public cmc g;

    static {
        clz clz = new clz();
        h = clz;
        aucj.a(clz.class, (aucj) clz);
    }

    private clz() {
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
            return aucj.a((audx) h, "\u0000\u0007\u0001\u0000\u0001\u001d\u0007\u0000\u0000\u0000\u0001\u0002\u0006=\u0000\u000b\u0004\u000f\u0010\u0011\u0002\u0017\t\u001dȻ\u0000", new Object[]{"b", "a", "c", "d", "f", "e", "g"});
        } else if (i3 == 3) {
            return new clz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (clz.class) {
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
