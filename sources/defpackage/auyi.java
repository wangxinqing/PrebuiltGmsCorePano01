package defpackage;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auyi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyi extends aucj implements audy {
    public static final auyi p;
    private static volatile auef q;
    public int a;
    public int b = 5;
    public boolean c = true;
    public boolean d = true;
    public double e = 18500.0d;
    public boolean f;
    public int g = 7;
    public int h;
    public double i = 48000.0d;
    public int j = 4;
    public int k = 4;
    public int l = 4;
    public int m = 16;
    public auyh n;
    public auyj o;

    static {
        auyi auyi = new auyi();
        p = auyi;
        aucj.a(auyi.class, (aucj) auyi);
    }

    private auyi() {
    }

    public static /* synthetic */ void a(auyi auyi) {
        auyi.a |= 1;
        auyi.b = 5;
    }

    public static /* synthetic */ void b(auyi auyi) {
        auyi.a |= 2;
        auyi.c = true;
    }

    public static /* synthetic */ void c(auyi auyi) {
        auyi.a |= 4;
        auyi.d = true;
    }

    public static /* synthetic */ void d(auyi auyi) {
        auyi.a |= 8;
        auyi.e = 18500.0d;
    }

    public static /* synthetic */ void e(auyi auyi) {
        auyi.a |= 16;
        auyi.f = false;
    }

    public static /* synthetic */ void f(auyi auyi) {
        auyi.a |= 32;
        auyi.g = 7;
    }

    public static /* synthetic */ void g(auyi auyi) {
        auyi.a |= 64;
        auyi.h = 0;
    }

    public static /* synthetic */ void h(auyi auyi) {
        auyi.a |= 128;
        auyi.i = 48000.0d;
    }

    public static /* synthetic */ void i(auyi auyi) {
        auyi.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        auyi.j = 4;
    }

    public static /* synthetic */ void j(auyi auyi) {
        auyi.a |= 512;
        auyi.k = 4;
    }

    public static /* synthetic */ void k(auyi auyi) {
        auyi.a |= 1024;
        auyi.l = 4;
    }

    public static /* synthetic */ void l(auyi auyi) {
        auyi.a |= 2048;
        auyi.m = 16;
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
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0000\u0003\u0005\u0007\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0000\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0004\u000b\r\t\f\u000e\t\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new auyi();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (auyi.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
