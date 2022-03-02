package defpackage;

/* renamed from: auyl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyl extends aucj implements audy {
    public static final auyl f;
    private static volatile auef k;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d = true;
    public boolean e = true;
    private boolean g;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;

    static {
        auyl auyl = new auyl();
        f = auyl;
        aucj.a(auyl.class, (aucj) auyl);
    }

    private auyl() {
    }

    public static /* synthetic */ void a(auyl auyl) {
        auyl.a |= 1;
        auyl.g = false;
    }

    public static /* synthetic */ void b(auyl auyl) {
        auyl.a |= 2;
        auyl.b = true;
    }

    public static /* synthetic */ void c(auyl auyl) {
        auyl.a |= 4;
        auyl.c = true;
    }

    public static /* synthetic */ void d(auyl auyl) {
        auyl.a |= 16;
        auyl.e = true;
    }

    public static /* synthetic */ void e(auyl auyl) {
        auyl.a |= 32;
        auyl.h = true;
    }

    public static /* synthetic */ void f(auyl auyl) {
        auyl.a |= 64;
        auyl.i = true;
    }

    public static /* synthetic */ void g(auyl auyl) {
        auyl.a |= 128;
        auyl.j = true;
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
            return aucj.a((audx) f, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007", new Object[]{"a", "g", "b", "c", "d", "e", "h", "i", "j"});
        } else if (i3 == 3) {
            return new auyl();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (auyl.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(f);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
