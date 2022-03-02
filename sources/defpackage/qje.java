package defpackage;

/* renamed from: qje  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qje extends aucj implements audy {
    public static final qje d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        qje qje = new qje();
        d = qje;
        aucj.a(qje.class, (aucj) qje);
    }

    private qje() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0002\u0006\u0003\u0000\u0003\u0000\u0002\u001b\u0005\u001b\u0006\u001b", new Object[]{"a", qjh.class, "b", qjn.class, "c", qjk.class});
        } else if (i2 == 3) {
            return new qje();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (qje.class) {
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
