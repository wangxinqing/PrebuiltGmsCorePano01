package defpackage;

/* renamed from: taf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class taf extends aucj implements audy {
    public static final taf e;
    private static volatile auef f;
    public aucv a = audl.b;
    public aucv b = audl.b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        taf taf = new taf();
        e = taf;
        aucj.a(taf.class, (aucj) taf);
    }

    private taf() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", szy.class, "d", tag.class});
        } else if (i2 == 3) {
            return new taf();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (taf.class) {
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

    public final void b() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
