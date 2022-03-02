package defpackage;

/* renamed from: agnx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnx extends aucj implements audy {
    public static final agnx k;
    private static volatile auef m;
    public int a;
    public baqx b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public String h = "";
    public boolean i;
    public barb j;
    private byte l = 2;

    static {
        agnx agnx = new agnx();
        k = agnx;
        aucj.a(agnx.class, (aucj) agnx);
    }

    private agnx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001\t\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0005\u0004\u0006\u0004\u0005\u0007\b\u0006\b\u0007\u0007\tЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new agnx();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (agnx.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(k);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
