package defpackage;

/* renamed from: avsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsh extends aucj implements audy {
    public static final avsh d;
    private static volatile auef e;
    public int a = 0;
    public Object b;
    public aucx c = auei.b;

    static {
        avsh avsh = new avsh();
        d = avsh;
        aucj.a(avsh.class, (aucj) avsh);
    }

    private avsh() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"b", "a", "c", avsg.class});
        } else if (i2 == 3) {
            return new avsh();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avsh.class) {
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

    public final void c() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
