package defpackage;

import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: yax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class yax {
    public static xnk a(xvu xvu) {
        int i;
        String l = xvu.l();
        aucd o = xnk.p.o();
        boolean e = xvu.e();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk = (xnk) o.b;
        xnk.a |= 8;
        xnk.e = e;
        if (l != null) {
            i = l.length();
        } else {
            i = 0;
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk2 = (xnk) o.b;
        xnk2.a |= 32;
        xnk2.g = i;
        boolean f = xvu.f();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk3 = (xnk) o.b;
        xnk3.a |= 128;
        xnk3.i = f;
        boolean b = xvu.b();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk4 = (xnk) o.b;
        xnk4.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        xnk4.j = b;
        boolean d = xvu.d();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk5 = (xnk) o.b;
        xnk5.a |= 1024;
        xnk5.k = d;
        boolean a = xvu.a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk6 = (xnk) o.b;
        xnk6.a |= 2048;
        xnk6.l = a;
        boolean c = xvu.c();
        if (o.c) {
            o.c();
            o.c = false;
        }
        xnk xnk7 = (xnk) o.b;
        xnk7.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
        xnk7.m = c;
        if (xvu.g() != null) {
            int longValue = (int) xvu.g().longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk8 = (xnk) o.b;
            xnk8.a |= 1;
            xnk8.b = longValue;
        }
        if (xvu.j() != null) {
            String j = xvu.j();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk9 = (xnk) o.b;
            j.getClass();
            xnk9.a |= 2;
            xnk9.c = j;
        }
        if (xvu.i() != null) {
            String l2 = Long.toString(xvu.i().longValue());
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk10 = (xnk) o.b;
            l2.getClass();
            xnk10.a |= 32768;
            xnk10.o = l2;
        }
        if (xvu.m() != null) {
            String m = xvu.m();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk11 = (xnk) o.b;
            m.getClass();
            xnk11.a |= 16384;
            xnk11.n = m;
        }
        if (xvu.h() != null) {
            int longValue2 = (int) xvu.h().longValue();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk12 = (xnk) o.b;
            xnk12.a |= 4;
            xnk12.d = longValue2;
        }
        if (xvu.k() == null) {
            String j2 = xvu.j();
            if (!TextUtils.isEmpty(j2)) {
                try {
                    long parseLong = Long.parseLong(j2, 16);
                    if (parseLong >= 0) {
                        if (parseLong < 10000 && !TextUtils.isEmpty(xvu.l())) {
                            String l3 = xvu.l();
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            xnk xnk13 = (xnk) o.b;
                            l3.getClass();
                            xnk13.a |= 16;
                            xnk13.f = l3;
                        }
                    }
                } catch (NumberFormatException e2) {
                    if (!TextUtils.isEmpty(xvu.l())) {
                        String l4 = xvu.l();
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        xnk xnk14 = (xnk) o.b;
                        l4.getClass();
                        xnk14.a |= 16;
                        xnk14.f = l4;
                    }
                }
            }
        } else {
            String k = xvu.k();
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk15 = (xnk) o.b;
            k.getClass();
            xnk15.a |= 64;
            xnk15.h = k;
            if (!TextUtils.isEmpty(xvu.l())) {
                String l5 = xvu.l();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                xnk xnk16 = (xnk) o.b;
                l5.getClass();
                xnk16.a |= 16;
                xnk16.f = l5;
            }
        }
        if ("Starred in Android".equals(xvu.l())) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            xnk xnk17 = (xnk) o.b;
            "Starred in Android".getClass();
            xnk17.a = 16 | xnk17.a;
            xnk17.f = "Starred in Android";
        }
        return (xnk) o.i();
    }
}
