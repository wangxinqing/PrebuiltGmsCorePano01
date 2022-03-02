package defpackage;

/* renamed from: anrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anrv extends aucj implements audy {
    public static final anrv k;
    private static volatile auef l;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public boolean i;
    public boolean j;

    static {
        anrv anrv = new anrv();
        k = anrv;
        aucj.a(anrv.class, (aucj) anrv);
    }

    private anrv() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0007\u0007\t\u0007\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new anrv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (anrv.class) {
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
