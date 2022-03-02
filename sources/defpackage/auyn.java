package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyn extends aucg implements audy {
    public static final auyn j;
    private static volatile auef p;
    public int a;
    public long b = 3000;
    public long c = 1000;
    public long d = 5000;
    public auym e;
    public auyl f;
    public int g;
    public int h = 1;
    public int i = 60;
    private int k = -77;
    private boolean l;
    private int n = 50;
    private byte o = 2;

    static {
        auyn auyn = new auyn();
        j = auyn;
        aucj.a(auyn.class, (aucj) auyn);
    }

    private auyn() {
    }

    public static /* synthetic */ void a(auyn auyn) {
        auyn.a |= 1;
        auyn.b = 3000;
    }

    public static /* synthetic */ void b(auyn auyn) {
        auyn.a |= 2;
        auyn.c = 1000;
    }

    public static /* synthetic */ void c(auyn auyn) {
        auyn.a |= 4;
        auyn.d = 5000;
    }

    public static /* synthetic */ void d(auyn auyn) {
        auyn.a |= 64;
        auyn.g = 200;
    }

    public static /* synthetic */ void e(auyn auyn) {
        auyn.a |= 128;
        auyn.k = -77;
    }

    public static /* synthetic */ void f(auyn auyn) {
        auyn.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        auyn.l = false;
    }

    public static /* synthetic */ void g(auyn auyn) {
        auyn.a |= 512;
        auyn.h = 1;
    }

    public static /* synthetic */ void h(auyn auyn) {
        auyn.a |= 1024;
        auyn.n = 50;
    }

    public static /* synthetic */ void i(auyn auyn) {
        auyn.a |= 2048;
        auyn.i = 60;
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
            return aucj.a((audx) j, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\t\u0003\u0006\t\u0005\u0007\u0004\u0006\b\u0004\u0007\u000b\u0007\b\r\u0004\t\u000e\u0004\n\u000f\u0004\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "k", "l", "h", "n", "i"});
        } else if (i3 == 3) {
            return new auyn();
        } else {
            if (i3 == 4) {
                return new aucf(j);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (auyn.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(j);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
