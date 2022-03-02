package defpackage;

/* renamed from: asrk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrk extends aucj implements audy {
    public static final asrk d;
    private static volatile auef e;
    public int a;
    public aucv b = audl.b;
    public String c = "";

    static {
        asrk asrk = new asrk();
        d = asrk;
        aucj.a(asrk.class, (aucj) asrk);
    }

    private asrk() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u0017", new Object[]{"a", "c", "b"});
        } else if (i2 == 3) {
            return new asrk();
        } else {
            if (i2 == 4) {
                return new aucd((char[][]) null, (byte[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asrk.class) {
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
