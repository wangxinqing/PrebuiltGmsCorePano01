package defpackage;

import android.os.Build;

/* renamed from: hei  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hei {
    private static volatile hei a;

    private hei() {
    }

    public static hei a() {
        hei hei = a;
        if (hei == null) {
            synchronized (hei.class) {
                hei = a;
                if (hei == null) {
                    hei = new hei();
                    a = hei;
                }
            }
        }
        return hei;
    }

    public static final boolean b() {
        return awxs.a.a().f();
    }

    public static final boolean c() {
        return awxs.a.a().g();
    }

    public static final boolean d() {
        return awxs.a.a().k();
    }

    public static final boolean e() {
        return awxs.a.a().v();
    }

    public static final int f() {
        return (int) awxs.a.a().y();
    }

    public static final boolean g() {
        return awxo.a.a().A();
    }

    public static final boolean i() {
        if (jkr.i()) {
            return awxs.a.a().E();
        }
        return awxs.a.a().D();
    }

    public static final boolean j() {
        return awxo.a.a().H();
    }

    public static final boolean h() {
        return Build.VERSION.SDK_INT < 24;
    }
}
