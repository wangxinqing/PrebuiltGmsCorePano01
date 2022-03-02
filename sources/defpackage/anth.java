package defpackage;

/* renamed from: anth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anth extends aucj implements audy {
    public static final anth d;
    private static volatile auef e;
    public long a;
    public int b;
    public int c;

    static {
        anth anth = new anth();
        d = anth;
        aucj.a(anth.class, (aucj) anth);
    }

    private anth() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0005\u000b", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new anth();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (anth.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
