package defpackage;

/* renamed from: aoaf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoaf extends aucj implements audy {
    public static final aoaf k;
    private static volatile auef l;
    public int a;
    public float b;
    public float c;
    public float d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    static {
        aoaf aoaf = new aoaf();
        k = aoaf;
        aucj.a(aoaf.class, (aucj) aoaf);
    }

    private aoaf() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0004\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aoaf();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aoaf.class) {
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
