package defpackage;

/* renamed from: oqh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqh extends aucj implements audy {
    public static final oqh c;
    private static volatile auef f;
    public aucx a = auei.b;
    public aucx b = auei.b;
    private int d;
    private boolean e;

    static {
        oqh oqh = new oqh();
        c = oqh;
        aucj.a(oqh.class, (aucj) oqh);
    }

    private oqh() {
    }

    public static /* synthetic */ void a(oqh oqh) {
        oqh.d |= 1;
        oqh.e = true;
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
            return aucj.a((audx) c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0007\u0000", new Object[]{"d", "a", oqf.class, "b", oqg.class, "e"});
        } else if (i2 == 3) {
            return new oqh();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (oqh.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}
