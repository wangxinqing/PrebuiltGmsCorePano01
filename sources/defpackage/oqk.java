package defpackage;

/* renamed from: oqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oqk extends aucj implements audy {
    public static final oqk e;
    private static volatile auef f;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucs d = aucl.b;

    static {
        oqk oqk = new oqk();
        e = oqk;
        aucj.a(oqk.class, (aucj) oqk);
    }

    private oqk() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001e\u0004\u001b", new Object[]{"a", oqh.class, "b", oql.class, "d", oqj.b(), "c", oql.class});
        } else if (i2 == 3) {
            return new oqk();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (oqk.class) {
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
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}
