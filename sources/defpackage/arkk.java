package defpackage;

/* renamed from: arkk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arkk extends aucj implements audy {
    public static final arkk d;
    private static volatile auef f;
    public long a;
    public int b;
    public float c;
    private int e;

    static {
        arkk arkk = new arkk();
        d = arkk;
        aucj.a(arkk.class, (aucj) arkk);
    }

    private arkk() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0003\u0000\u0002\u000b\u0001\u0003\u0001\u0002", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new arkk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arkk.class) {
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
