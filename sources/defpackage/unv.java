package defpackage;

import android.net.wifi.WifiManager;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: unv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class unv extends urq {
    public unu a;
    private final WifiManager b;
    private final aosh c;
    private final WifiManager.LocalOnlyHotspotCallback d;
    private WifiManager.LocalOnlyHotspotReservation e;

    public unv(WifiManager wifiManager, aosh aosh, WifiManager.LocalOnlyHotspotCallback localOnlyHotspotCallback) {
        super(62);
        this.b = wifiManager;
        this.c = aosh;
        this.d = localOnlyHotspotCallback;
    }

    public final void a() {
        WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation = this.e;
        if (localOnlyHotspotReservation != null) {
            localOnlyHotspotReservation.close();
            this.e = null;
        }
    }

    public final int b() {
        this.b.startLocalOnlyHotspot(this.d, (Handler) null);
        try {
            this.e = (WifiManager.LocalOnlyHotspotReservation) this.c.get(aymi.ae(), TimeUnit.SECONDS);
            this.a = new unu(this.e.getWifiConfiguration().SSID, this.e.getWifiConfiguration().preSharedKey, uoh.a(this.b));
            return 2;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("unv", "b", 1740, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to enable local only hotspot.");
            return 3;
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("unv", "b", 1742, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start local only hotspot.");
            return 3;
        } catch (TimeoutException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("unv", "b", 1744, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting for local only hotspot to start.");
            return 3;
        } catch (IOException e5) {
            anih anih3 = (anih) ulh.a.b();
            anih3.a((Throwable) e5);
            ((anih) anih3.a("unv", "b", 1746, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start a local only hotspot because we couldn't get the IP address.");
            return 3;
        }
    }
}
