package defpackage;

/* renamed from: avcu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcu extends aucg implements audy {
    public static final avcu e;
    private static volatile auef g;
    public int a;
    public avcy b;
    public auzy c;
    public auzj d;
    private byte f = 2;

    static {
        avcu avcu = new avcu();
        e = avcu;
        aucj.a(avcu.class, (aucj) avcu);
    }

    private avcu() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0005Љ\u0001\u0006Љ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avcu();
        } else {
            if (i2 == 4) {
                return new aucf(e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avcu.class) {
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
