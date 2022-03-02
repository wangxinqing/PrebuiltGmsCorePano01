package defpackage;

import java.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acsh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acsh {
    static hol a;
    static hph b;
    private static long c = 0;
    private static boolean d;

    private static hph a() {
        if (b == null) {
            if (a == null) {
                a = new hol(ihs.b(), "PLATFORM_STATS_COUNTERS", (String) null);
            }
            b = new hph(a, "PLATFORM_STATS_COUNTERS", 1024);
        }
        return b;
    }

    private static boolean b() {
        if (Instant.now().toEpochMilli() <= c + azmv.a.a().k()) {
            return d;
        }
        boolean z = false;
        if (azoi.b()) {
            acwa f = adrz.a(ihs.b(), new adry()).f("PLATFORM_STATS_COUNTERS");
            try {
                acws.a(f, 10000, TimeUnit.MILLISECONDS);
            } catch (ExecutionException | TimeoutException e) {
                b.c("ControlledEventsConsentApiCanLogFailure").a();
            } catch (InterruptedException e2) {
                b.c("ControlledEventsConsentApiCanLogFailure").a();
                Thread.currentThread().interrupt();
            }
            if (f.b() && f.d() != null && ((Boolean) f.d()).booleanValue()) {
                z = true;
            }
            d = z;
        } else {
            ihs b2 = ihs.b();
            a();
            boolean c2 = acub.c();
            new acro();
            boolean z2 = !acro.a(b2).isEmpty();
            boolean b3 = aznh.b();
            if (c2 || z2 || b3) {
                z = true;
            }
            d = z;
        }
        c = Instant.now().toEpochMilli();
        return d;
    }

    public static void a(String str) {
        a(str, 1);
    }

    public static void a(String str, int i) {
        if (b()) {
            a().c(str).a((long) i);
            a().d();
        }
    }
}
