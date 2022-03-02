package defpackage;

/* renamed from: auyo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyo extends aucg implements audy {
    public static final auyo j;
    private static volatile auef n;
    public long a = 5000;
    public long b = 300;
    public long c = 8000;
    public long d = 3000;
    public long e = 10000;
    public long f = 5000;
    public long g;
    public long h = 1000;
    public long i = 500;
    private int k;
    private byte l = 2;

    static {
        auyo auyo = new auyo();
        j = auyo;
        aucj.a(auyo.class, (aucj) auyo);
    }

    private auyo() {
    }

    public static /* synthetic */ void a(auyo auyo) {
        auyo.k |= 1;
        auyo.a = 5000;
    }

    public static /* synthetic */ void b(auyo auyo) {
        auyo.k |= 2;
        auyo.b = 300;
    }

    public static /* synthetic */ void c(auyo auyo) {
        auyo.k |= 4;
        auyo.c = 8000;
    }

    public static /* synthetic */ void d(auyo auyo) {
        auyo.k |= 8;
        auyo.d = 3000;
    }

    public static /* synthetic */ void e(auyo auyo) {
        auyo.k |= 16;
        auyo.e = 10000;
    }

    public static /* synthetic */ void f(auyo auyo) {
        auyo.k |= 32;
        auyo.f = 5000;
    }

    public static /* synthetic */ void g(auyo auyo) {
        auyo.k |= 512;
        auyo.g = 0;
    }

    public static /* synthetic */ void h(auyo auyo) {
        auyo.k |= 1024;
        auyo.h = 1000;
    }

    public static /* synthetic */ void i(auyo auyo) {
        auyo.k |= 2048;
        auyo.i = 100;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.l);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.l = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u000b\u0002\t\f\u0002\n\r\u0002\u000b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
        } else if (i3 == 3) {
            return new auyo();
        } else {
            if (i3 == 4) {
                return new aucf(j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (auyo.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(j);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
