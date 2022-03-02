package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uox implements NsdManager.RegistrationListener {
    public final NsdServiceInfo a;
    public final thc b;
    private final aosh c = aosh.f();
    private final aosh d = aosh.f();

    public uox(thc thc, NsdServiceInfo nsdServiceInfo) {
        this.a = nsdServiceInfo;
        this.b = thc;
    }

    private final void c() {
        try {
            this.d.get(aymi.a.a().bI(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uox", "c", 860, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while stopping MDNS advertising");
        } catch (ExecutionException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uox", "c", 862, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop MDNS advertising");
        } catch (TimeoutException e3) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("uox", "c", 864, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting for MDNS advertising to stop");
        }
    }

    public final boolean a() {
        try {
            this.c.get(aymi.a.a().bH(), TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uox", "a", 838, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while starting MDNS advertising");
            return false;
        } catch (ExecutionException e2) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e2);
            ((anih) anih.a("uox", "a", 840, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start MDNS advertising");
            return false;
        } catch (TimeoutException e3) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("uox", "a", 842, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting for MDNS advertising to start");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        NsdManager nsdManager = this.b.a;
        if (nsdManager != null) {
            try {
                nsdManager.unregisterService(this);
                c();
            } catch (IllegalArgumentException e) {
            }
        } else {
            throw new RuntimeException("NsdManagerCompat.unregisterService can only be called on P+.");
        }
    }

    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        aosh aosh = this.c;
        String valueOf = String.valueOf(ule.a(i));
        aosh.a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to register service: ") : "Failed to register service: ".concat(valueOf)));
    }

    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        if (!this.a.getServiceName().equals(nsdServiceInfo.getServiceName())) {
            this.c.a((Throwable) new Exception("Failed to register service because another device is already using that service name."));
        } else {
            this.c.b((Object) null);
        }
    }

    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        this.d.b((Object) null);
    }

    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        aosh aosh = this.d;
        String valueOf = String.valueOf(ule.a(i));
        aosh.a((Throwable) new Exception(valueOf.length() == 0 ? new String("Failed to unregister service: ") : "Failed to unregister service: ".concat(valueOf)));
    }
}
