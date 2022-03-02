package defpackage;

/* renamed from: auzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auzc extends aucg implements audy {
    public static final auzc e;
    private static volatile auef g;
    public int a;
    public long b;
    public auzd c;
    public auzl d;
    private byte f = 2;

    static {
        auzc auzc = new auzc();
        e = auzc;
        aucj.a(auzc.class, (aucj) auzc);
    }

    private auzc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\u0002\u0000\u0002Љ\u0001\u0005\t\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new auzc();
        } else {
            if (i2 == 4) {
                return new aucf(e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auzc.class) {
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
