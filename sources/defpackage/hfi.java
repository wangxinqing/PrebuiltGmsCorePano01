package defpackage;

/* renamed from: hfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfi extends aucj implements audy {
    public static final hfi g;
    private static volatile auef h;
    public int a;
    public hfg b;
    public boolean c;
    public boolean d;
    public long e;
    public boolean f;

    static {
        hfi hfi = new hfi();
        g = hfi;
        aucj.a(hfi.class, (aucj) hfi);
    }

    private hfi() {
    }

    static /* synthetic */ void a(hfi hfi) {
        hfi.a |= 4;
        hfi.d = true;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0002\u0003\u0005\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new hfi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (hfi.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
