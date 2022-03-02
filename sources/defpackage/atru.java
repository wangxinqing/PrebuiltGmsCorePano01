package defpackage;

/* renamed from: atru  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atru extends aucj implements audy {
    public static final atru d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public atrt b;
    public auay c = auay.b;

    static {
        atru atru = new atru();
        d = atru;
        aucj.a(atru.class, (aucj) atru);
        atjm atjm = atjm.a;
        atru atru2 = d;
        e = aucj.a((audx) atjm, (Object) atru2, (audx) atru2, 92880878, aufw.MESSAGE);
    }

    private atru() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new atru();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atru.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
