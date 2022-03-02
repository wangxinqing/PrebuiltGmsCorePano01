package defpackage;

/* renamed from: aupk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aupk extends aucj implements audy {
    public static final aupk e;
    private static volatile auef g;
    public int a;
    public auox b;
    public String c;
    public aucx d;
    private byte f = 2;

    static {
        aupk aupk = new aupk();
        e = aupk;
        aucj.a(aupk.class, (aucj) aupk);
    }

    private aupk() {
        auei auei = auei.b;
        this.c = "";
        this.d = auei.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0001\u0001\u0004Љ\u0002\u0006\b\u0004\b\u001b", new Object[]{"a", "b", "c", "d", auow.class});
        } else if (i2 == 3) {
            return new aupk();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aupk.class) {
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
