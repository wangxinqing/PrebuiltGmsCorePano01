package defpackage;

import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: hwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hwt {
    public static PlayLoggerContext a(avtn avtn) {
        int i = avtn.a;
        return new PlayLoggerContext((i & 2) != 0 ? avtn.b : null, avtn.c, avtn.d, (i & 16) != 0 ? avtn.e : null, (i & 32) != 0 ? avtn.f : null, avtn.g, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? avtn.i : null, avtn.j, 0, (i & FragmentTransaction.TRANSIT_EXIT_MASK) != 0 ? Integer.valueOf(avtn.n) : null);
    }

    public static String b(avtn avtn) {
        if (avtn.i.isEmpty()) {
            return (avtn.a & 8) != 0 ? Integer.toString(avtn.d) : "";
        }
        return avtn.i;
    }

    public static avtn c(avtn avtn) {
        aucd o = avtn.o.o();
        if ((avtn.a & 512) != 0) {
            boolean z = avtn.j;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtn avtn2 = (avtn) o.b;
            avtn2.a |= 512;
            avtn2.j = z;
        }
        if ((avtn.a & 16) != 0) {
            String str = avtn.e;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtn avtn3 = (avtn) o.b;
            str.getClass();
            avtn3.a |= 16;
            avtn3.e = str;
        }
        if ((avtn.a & 128) != 0) {
            String str2 = avtn.h;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtn avtn4 = (avtn) o.b;
            str2.getClass();
            avtn4.a |= 128;
            avtn4.h = str2;
        }
        if (!awua.b() && (avtn.a & 1024) != 0) {
            int i = avtn.k;
            if (o.c) {
                o.c();
                o.c = false;
            }
            avtn avtn5 = (avtn) o.b;
            avtn5.a |= 1024;
            avtn5.k = i;
        }
        return (avtn) o.i();
    }

    public static String a(PlayLoggerContext playLoggerContext) {
        if (!amrk.a(playLoggerContext.g)) {
            return playLoggerContext.g;
        }
        int i = playLoggerContext.c;
        return i > 0 ? String.valueOf(i) : "";
    }
}
