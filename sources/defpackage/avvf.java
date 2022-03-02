package defpackage;

/* renamed from: avvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avvf extends aucj implements audy {
    public static final avvf h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public audr e = audr.b;
    public aucx f = auei.b;
    public int g;

    static {
        avvf avvf = new avvf();
        h = avvf;
        aucj.a(avvf.class, (aucj) avvf);
    }

    private avvf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0001\u0002\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001b\u00052\u0006\u001b\b\u0004\u0003", new Object[]{"a", "b", "c", "d", avvb.class, "e", avve.a, "f", avvc.class, "g"});
        } else if (i3 == 3) {
            return new avvf();
        } else {
            if (i3 == 4) {
                return new aucd((short[]) null, (short[]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avvf.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}
