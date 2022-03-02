package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auyp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyp extends aucg implements audy {
    public static final auyp g;
    private static volatile auef p;
    public long a;
    public long b = 1100;
    public long c = 1500;
    public long d = 300;
    public long e = 150;
    public long f = 400;
    private int h;
    private long i = 300;
    private long j = 500;
    private long k = 4000;
    private int l = 2000;
    private int n = 200;
    private byte o = 2;

    static {
        auyp auyp = new auyp();
        g = auyp;
        aucj.a(auyp.class, (aucj) auyp);
    }

    private auyp() {
    }

    public static /* synthetic */ void a(auyp auyp) {
        auyp.h |= 1;
        auyp.a = 0;
    }

    public static /* synthetic */ void b(auyp auyp) {
        auyp.h |= 2;
        auyp.i = 300;
    }

    public static /* synthetic */ void c(auyp auyp) {
        auyp.h |= 4;
        auyp.j = 500;
    }

    public static /* synthetic */ void d(auyp auyp) {
        auyp.h |= 8;
        auyp.b = 1100;
    }

    public static /* synthetic */ void e(auyp auyp) {
        auyp.h |= 16;
        auyp.c = 1500;
    }

    public static /* synthetic */ void f(auyp auyp) {
        auyp.h |= 32;
        auyp.k = 4000;
    }

    public static /* synthetic */ void g(auyp auyp) {
        auyp.h |= 64;
        auyp.d = 300;
    }

    public static /* synthetic */ void h(auyp auyp) {
        auyp.h |= 128;
        auyp.e = 150;
    }

    public static /* synthetic */ void i(auyp auyp) {
        auyp.h |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        auyp.f = 400;
    }

    public static /* synthetic */ void j(auyp auyp) {
        auyp.h |= 512;
        auyp.l = 2000;
    }

    public static /* synthetic */ void k(auyp auyp) {
        auyp.h |= 1024;
        auyp.n = 200;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.o);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.o = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0004\u0002\u0002\u0005\u0002\u0003\u0006\u0002\u0004\u0007\u0002\u0005\b\u0002\u0006\t\u0002\u0007\n\u0002\b\u000b\u0004\t\f\u0004\n", new Object[]{"h", "a", "i", "j", "b", "c", "k", "d", "e", "f", "l", "n"});
        } else if (i3 == 3) {
            return new auyp();
        } else {
            if (i3 == 4) {
                return new aucf(g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (auyp.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(g);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
