package defpackage;

/* renamed from: aqrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqrf extends aucj implements audy {
    public static final aqrf d;
    private static volatile auef e;
    public int a;
    public aqso b;
    public aucx c = auei.b;

    static {
        aqrf aqrf = new aqrf();
        d = aqrf;
        aucj.a(aqrf.class, (aucj) aqrf);
    }

    private aqrf() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", aqso.class});
        } else if (i2 == 3) {
            return new aqrf();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (float[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqrf.class) {
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
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
