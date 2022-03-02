package defpackage;

/* renamed from: gsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsf extends aucj implements audy {
    public static final gsf e;
    private static volatile auef g;
    public int a;
    public long b;
    public String c = "";
    public aucx d = auei.b;
    private byte f = 2;

    static {
        gsf gsf = new gsf();
        e = gsf;
        aucj.a(gsf.class, (aucj) gsf);
    }

    private gsf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u000e\u0003\u0000\u0001\u0003\u0001Ԃ\u0000\u0002б\u000eԈ\u0004", new Object[]{"a", "b", "d", gse.class, "c"});
        } else if (i2 == 3) {
            return new gsf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (gsf.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
