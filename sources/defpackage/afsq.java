package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: afsq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afsq {
    public static long a(afkr afkr) {
        if (afkr.h != 0) {
            return TimeUnit.SECONDS.toMillis(afkr.h);
        }
        return Long.MAX_VALUE;
    }

    public static String b(afkn afkn) {
        return a(afkn) ? afkn.h : afkn.f;
    }

    public static aflf a(String str, String str2) {
        aucd o = aflf.f.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aflf aflf = (aflf) o.b;
        str.getClass();
        aflf.a |= 1;
        aflf.b = str;
        if (amrk.a(str2)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflf aflf2 = (aflf) o.b;
            "com.google.android.gms".getClass();
            aflf2.a |= 2;
            aflf2.c = "com.google.android.gms";
        } else {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aflf aflf3 = (aflf) o.b;
            str2.getClass();
            aflf3.a |= 2;
            aflf3.c = str2;
        }
        return (aflf) o.i();
    }

    public static boolean a(long j, aekn aekn) {
        return j <= aekn.a();
    }

    public static boolean a(afkn afkn) {
        if ((afkn.a & 32) != 0) {
            avlu avlu = afkn.g;
            if (avlu == null) {
                avlu = avlu.b;
            }
            aucx aucx = avlu.a;
            int size = aucx.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (((avlt) aucx.get(i)).a == 4) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }
}
