package defpackage;

import android.content.Context;

/* renamed from: gji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gji {
    private static gji b;
    public final hol a;

    private gji(Context context) {
        this.a = new hol(context, "AUTH_MANAGED", (String) null);
    }

    public static bapz a() {
        aucd o = bapz.c.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        bapz bapz = (bapz) o.b;
        bapz.a |= 1;
        bapz.b = 0;
        return (bapz) o.i();
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1) {
                return 3;
            }
            if (i == 2) {
                return 5;
            }
            if (i == 3) {
                return 6;
            }
            if (i == 4) {
                return 7;
            }
            if (i != 5) {
                return (i == 65536 || i == 196608 || i == 327680) ? 2 : 1;
            }
            return 8;
        }
    }

    public static synchronized gji a(Context context) {
        gji gji;
        synchronized (gji.class) {
            if (b == null) {
                b = new gji(context.getApplicationContext());
            }
            gji = b;
        }
        return gji;
    }

    public final void a(int i) {
        aucd o = baqb.g.o();
        bapz a2 = a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqb baqb = (baqb) o.b;
        a2.getClass();
        baqb.b = a2;
        int i2 = baqb.a | 1;
        baqb.a = i2;
        int i3 = i - 1;
        baqb.c = i3;
        baqb.a = i2 | 2;
        baqb baqb2 = (baqb) o.i();
        if (awpr.c()) {
            hoi a3 = this.a.a(baqb2.k());
            a3.b(i3);
            a3.b();
            return;
        }
        this.a.a(baqb2.k()).b();
    }

    public final void a(int i, avwi avwi) {
        if (!awpr.b() || avwi == null || (avwi.a & 1) == 0) {
            a(i);
            return;
        }
        String str = avwi.b;
        aucd o = baqb.g.o();
        bapz a2 = a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqb baqb = (baqb) o.b;
        a2.getClass();
        baqb.b = a2;
        int i2 = baqb.a | 1;
        baqb.a = i2;
        int i3 = i - 1;
        baqb.c = i3;
        int i4 = i2 | 2;
        baqb.a = i4;
        str.getClass();
        baqb.a = i4 | 16;
        baqb.f = str;
        hoi a3 = this.a.a(((baqb) o.i()).k());
        a3.b(i3);
        a3.b();
    }

    public final void a(int i, baqa baqa) {
        aucd o = baqb.g.o();
        bapz a2 = a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        baqb baqb = (baqb) o.b;
        a2.getClass();
        baqb.b = a2;
        int i2 = baqb.a | 1;
        baqb.a = i2;
        int i3 = i - 1;
        baqb.c = i3;
        int i4 = i2 | 2;
        baqb.a = i4;
        baqa.getClass();
        baqb.d = baqa;
        baqb.a = i4 | 4;
        baqb baqb2 = (baqb) o.i();
        if (awpr.c()) {
            hoi a3 = this.a.a(baqb2.k());
            a3.b(i3);
            a3.b();
            return;
        }
        this.a.a(baqb2.k()).b();
    }
}
