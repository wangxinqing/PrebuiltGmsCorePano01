package defpackage;

import android.net.wifi.aware.PublishConfig;
import android.net.wifi.aware.PublishDiscoverySession;
import android.net.wifi.aware.WifiAwareSession;
import android.os.Handler;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uvb extends urq {
    public final String a;
    public final uts b;
    private final uuy c;
    private final byte[] d;
    private final uvp e;
    private PublishDiscoverySession f;

    public uvb(uuy uuy, String str, byte[] bArr, uvp uvp, uts uts) {
        super(51);
        this.c = uuy;
        this.a = str;
        this.d = bArr;
        this.e = uvp;
        this.b = uts;
    }

    private static PublishConfig a(String str, byte[] bArr, byte[] bArr2) {
        return new PublishConfig.Builder().setServiceName(uvf.f(str)).setServiceSpecificInfo(bArr).setMatchFilter(Arrays.asList(new byte[][]{aoog.a(1), bArr2})).setPublishType(0).setTerminateNotificationEnabled(true).build();
    }

    private final boolean c() {
        try {
            this.f.updatePublish(a(this.a, new byte[0], this.c.c));
            return true;
        } catch (SecurityException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvb", "c", 1293, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invalidate the WiFi Aware publish.");
            return false;
        }
    }

    public final int b() {
        WifiAwareSession a2 = this.c.a();
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("uvb", "b", 1187, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to start WiFi Aware publishing because a WiFi Aware session could not be acquired.");
            return 4;
        }
        String a3 = ulu.a(this.d);
        aosh f2 = aosh.f();
        byte[] bArr = this.c.c;
        try {
            PublishConfig a4 = a(this.a, this.d, bArr);
            uva uva = r1;
            uva uva2 = new uva(this, this.e, this.a, f2, a3);
            a2.publish(a4, uva, (Handler) null);
        } catch (IllegalArgumentException e2) {
            f2.a((Throwable) e2);
        }
        try {
            PublishDiscoverySession publishDiscoverySession = (PublishDiscoverySession) f2.get(aymi.X(), TimeUnit.SECONDS);
            this.f = publishDiscoverySession;
            this.b.a(this.a, publishDiscoverySession);
            ((anih) ((anih) ulh.a.d()).a("uvb", "b", 1240, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Successfully published WiFi Aware advertisement %s with service id %s and session id %s.", (Object) a3, (Object) this.a, (Object) ulu.a(bArr));
            return 2;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uvb", "b", 1247, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to start publishing.");
            return 4;
        } catch (ExecutionException e4) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e4);
            ((anih) anih.a("uvb", "b", 1249, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start WiFi Aware publishing advertisement %s with service id %s with session id %s.", (Object) a3, (Object) this.a, (Object) ulu.a(bArr));
            return 4;
        } catch (TimeoutException e5) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e5);
            ((anih) anih2.a("uvb", "b", 1254, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to publish %s over WiFi Aware in %d seconds with session id %s.", (Object) a3, (Object) Long.valueOf(aymi.X()), (Object) ulu.a(bArr));
            return 4;
        }
    }

    public final void c(int i) {
        boolean z = false;
        try {
            this.f.updatePublish(a(this.a, new byte[0], this.c.c));
            z = true;
        } catch (SecurityException e2) {
            anih anih = (anih) ulh.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("uvb", "c", 1293, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to invalidate the WiFi Aware publish.");
        }
        this.b.a(this.f);
        if (!z || i == 2) {
            this.b.a(this.a);
        }
        ((anih) ((anih) ulh.a.d()).a("uvb", "c", 1280, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Stopped publishing WiFi Aware advertisement.");
    }
}
