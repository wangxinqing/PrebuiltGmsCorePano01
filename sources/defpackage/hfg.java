package defpackage;

/* renamed from: hfg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfg extends aucj implements audy {
    public static final hfg d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        hfg hfg = new hfg();
        d = hfg;
        aucj.a(hfg.class, (aucj) hfg);
    }

    private hfg() {
    }

    public final void b() {
        if (!this.b.a()) {
            this.b = aucj.a(this.b);
        }
    }

    public final void c() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }

    static /* synthetic */ void a(hfg hfg, ansk ansk) {
        ansk.getClass();
        hfg.a();
        hfg.a.set(0, ansk);
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0005\u001b", new Object[]{"a", ansk.class, "b", hfp.class, "c", bob.class});
        } else if (i2 == 3) {
            return new hfg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (hfg.class) {
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

    public final void a() {
        if (!this.a.a()) {
            this.a = aucj.a(this.a);
        }
    }
}
