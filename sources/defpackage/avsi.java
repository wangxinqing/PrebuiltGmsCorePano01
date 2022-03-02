package defpackage;

/* renamed from: avsi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsi extends aucj implements audy {
    public static final avsi e;
    private static volatile auef f;
    public int a;
    public long b;
    public aucx c = auei.b;
    public auay d = auay.b;

    static {
        avsi avsi = new avsi();
        e = avsi;
        aucj.a(avsi.class, (aucj) avsi);
    }

    private avsi() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b\u0003\n\u0002", new Object[]{"a", "b", "c", avsh.class, "d"});
        } else if (i2 == 3) {
            return new avsi();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avsi.class) {
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

    public final void c() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
