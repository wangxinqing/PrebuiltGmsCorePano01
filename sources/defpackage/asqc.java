package defpackage;

/* renamed from: asqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqc extends aucj implements audy {
    public static final asqc e;
    private static volatile auef f;
    public String a = "";
    public String b = "";
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        asqc asqc = new asqc();
        e = asqc;
        aucj.a(asqc.class, (aucj) asqc);
    }

    private asqc() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", asqb.class, "d", asqd.class});
        } else if (i2 == 3) {
            return new asqc();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asqc.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
