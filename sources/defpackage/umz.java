package defpackage;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pManager;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: umz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umz extends urq {
    public final Context a;
    public final WifiP2pManager b;
    public final uwc c;
    public WifiP2pManager.Channel d;
    public uwd e;
    private final String f;
    private final String i;
    private final int j;
    private final int k;
    private final tfw l;

    public umz(Context context, WifiP2pManager wifiP2pManager, uwc uwc, String str, String str2, int i2, int i3, tfw tfw) {
        super(72, tfw);
        this.a = context;
        this.b = wifiP2pManager;
        this.c = uwc;
        this.f = str;
        this.i = str2;
        this.j = i2;
        this.k = i3;
        this.l = tfw;
    }

    private final InetAddress a(String str, String str2) {
        WifiP2pConfig.Builder passphrase = new WifiP2pConfig.Builder().setNetworkName(str).setPassphrase(str2);
        int i2 = this.k;
        if (i2 != -1) {
            passphrase.setGroupOperatingFrequency(i2);
        }
        umx umx = new umx(this, passphrase.build(), str);
        arzi arzi = new arzi(aymi.aa());
        arzi.a = this.l.c();
        if (!arzk.a((Runnable) umx, "Connect", arzi.a()) && uwc.b()) {
            aosh f2 = aosh.f();
            this.b.cancelConnect(this.d, new umu(f2));
            try {
                f2.get(aymi.ab(), TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((anih) ((anih) ulh.a.b()).a("umz", "a", 895, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to connect to WiFi Direct group");
            } catch (ExecutionException e3) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e3);
                ((anih) anih.a("umz", "a", 897, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to connect to WiFi Direct group");
            } catch (TimeoutException e4) {
                anih anih2 = (anih) ulh.a.b();
                anih2.a((Throwable) e4);
                ((anih) anih2.a("umz", "a", 899, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting connect to WiFi Direct group");
            }
        }
        return umx.a;
    }

    public final int b() {
        uwd uwd;
        WifiP2pManager.Channel a2 = this.c.a(3);
        this.d = a2;
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("umz", "b", 738, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't connect to WifiP2pDevice because we failed to initialize a WiFi Direct channel.");
            return 3;
        }
        InetAddress a3 = a(this.f, this.i);
        if (a3 == null) {
            this.c.b(3);
            return 3;
        }
        int i2 = this.j;
        umy umy = new umy(a3, i2);
        arzi arzi = new arzi(aymi.aa());
        arzi.a = this.l.c();
        if (arzk.a((Runnable) umy, "CreateSocket", arzi.a())) {
            ((anih) ((anih) ulh.a.d()).a("umz", "a", 948, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct successfully connected to %s:%s", (Object) a3, i2);
            uwd = umy.a;
        } else {
            uwd = null;
        }
        this.e = uwd;
        if (uwd != null) {
            uwd.a(new umv(this));
            jjg jjg = ulh.a;
            return a(73);
        }
        this.c.b(3);
        return 3;
    }

    private final uwd a(InetAddress inetAddress, int i2) {
        umy umy = new umy(inetAddress, i2);
        arzi arzi = new arzi(aymi.aa());
        arzi.a = this.l.c();
        if (!arzk.a((Runnable) umy, "CreateSocket", arzi.a())) {
            return null;
        }
        ((anih) ((anih) ulh.a.d()).a("umz", "a", 948, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("WiFi Direct successfully connected to %s:%s", (Object) inetAddress, i2);
        return umy.a;
    }
}
