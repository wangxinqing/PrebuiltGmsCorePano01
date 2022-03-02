package defpackage;

import android.net.wifi.aware.SubscribeConfig;
import android.net.wifi.aware.SubscribeDiscoverySession;
import android.net.wifi.aware.WifiAwareSession;
import android.os.Handler;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uve extends urq {
    public final String a;
    public final uts b;
    public SubscribeDiscoverySession c;
    public final uuk d;
    private final uuy e;
    private final uvp f;

    public uve(uuy uuy, String str, uvp uvp, uts uts, uuk uuk) {
        super(52);
        this.e = uuy;
        this.a = str;
        this.f = uvp;
        this.b = uts;
        this.d = uuk;
    }

    public final int b() {
        WifiAwareSession a2 = this.e.a();
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("uve", "b", 1349, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware subscribing because a WiFi Aware session could not be acquired.");
            return 4;
        }
        SubscribeConfig build = new SubscribeConfig.Builder().setServiceName(uvf.f(this.a)).setMatchFilter(Arrays.asList(new byte[][]{null, null})).setSubscribeType(0).setTerminateNotificationEnabled(true).build();
        aosh f2 = aosh.f();
        try {
            a2.subscribe(build, new uvd(this, this.f, this.a, f2), (Handler) null);
        } catch (IllegalArgumentException e2) {
            f2.a((Throwable) e2);
        }
        try {
            SubscribeDiscoverySession subscribeDiscoverySession = (SubscribeDiscoverySession) f2.get(aymi.Y(), TimeUnit.SECONDS);
            this.c = subscribeDiscoverySession;
            this.b.a(this.a, subscribeDiscoverySession);
            ((anih) ((anih) ulh.a.d()).a("uve", "b", 1422, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully started WiFi Aware subscription for serviceId %s.", (Object) this.a);
            return 2;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uve", "b", 1427, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to start subscribing.");
            return 4;
        } catch (ExecutionException e4) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e4);
            ((anih) anih.a("uve", "b", 1429, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start WiFi Aware subscribing for serviceId %s.", (Object) this.a);
            return 4;
        } catch (TimeoutException e5) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e5);
            ((anih) anih2.a("uve", "b", 1432, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to subscribe to %s over WiFi Aware in %d seconds.", (Object) this.a, aymi.Y());
            return 4;
        }
    }

    public final void c(int i) {
        this.b.a(this.c);
        if (i == 2) {
            this.b.b(this.a);
        }
        ((anih) ((anih) ulh.a.d()).a("uve", "c", 1450, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped subscribing for WiFi Aware advertisements.");
    }
}
