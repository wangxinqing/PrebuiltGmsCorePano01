package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pManager;
import com.google.android.gms.nearby.mediums.WifiDirect$CreateGroupOperation$1;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: unc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class unc extends urq {
    public final String a;
    public final String b;
    public int c = -1;
    private final Context d;
    private final WifiP2pManager e;
    private final uwc f;
    private WifiP2pManager.Channel i;
    private final boolean j;
    private final tfw k;

    public unc(Context context, WifiP2pManager wifiP2pManager, uwc uwc, String str, String str2, boolean z, tfw tfw) {
        super(71, tfw);
        this.d = context;
        this.e = wifiP2pManager;
        this.f = uwc;
        this.a = str;
        this.b = str2;
        this.j = z;
        this.k = tfw;
    }

    public final void a() {
        c();
        this.f.b(1);
        this.i = null;
    }

    public final int b() {
        WifiP2pManager.Channel a2 = this.f.a(1);
        this.i = a2;
        if (a2 == null) {
            ((anih) ((anih) ulh.a.b()).a("unc", "b", 530, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Can't create a WiFi Direct group because we failed to initialize a WiFi Direct channel.");
            return 3;
        }
        String str = this.a;
        WifiP2pConfig.Builder passphrase = new WifiP2pConfig.Builder().setNetworkName(str).setPassphrase(this.b);
        if (this.j) {
            passphrase.setGroupOperatingBand(2);
        } else {
            passphrase.setGroupOperatingBand(1);
        }
        una una = new una(this, passphrase);
        arzi arzi = new arzi(aymi.a.a().br());
        arzi.a = this.k.c();
        if (arzk.a((Runnable) una, "CreateGroup", arzi.a())) {
            return 2;
        }
        ((anih) ((anih) ulh.a.d()).a("unc", "b", 538, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create a WiFi Direct group");
        this.f.b(1);
        return 3;
    }

    public final void c() {
        aosh f2 = aosh.f();
        this.e.removeGroup(this.i, new umu(f2));
        try {
            f2.get(aymi.a.a().bu(), TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("unc", "c", 662, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while removing WiFi Direct group");
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("unc", "c", 664, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to remove WiFi Direct group");
        } catch (TimeoutException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("unc", "c", 666, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting to remove WiFi Direct group");
        }
    }

    public final void a(PrintWriter printWriter) {
        super.a(printWriter);
        printWriter.write(String.format("    Use 5Ghz: %s\n", new Object[]{Boolean.valueOf(this.j)}));
        printWriter.flush();
    }

    public final boolean a(WifiP2pConfig wifiP2pConfig) {
        Context context;
        aosh f2 = aosh.f();
        WifiDirect$CreateGroupOperation$1 wifiDirect$CreateGroupOperation$1 = new WifiDirect$CreateGroupOperation$1(this, "nearby", f2);
        this.d.registerReceiver(wifiDirect$CreateGroupOperation$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        try {
            this.e.createGroup(this.i, wifiP2pConfig, new unb(f2));
            f2.get(aymi.a.a().bs(), TimeUnit.SECONDS);
            thp.a(this.d, (BroadcastReceiver) wifiDirect$CreateGroupOperation$1);
            return true;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            anih anih = (anih) ulh.a.d();
            anih.a((Throwable) e2);
            ((anih) anih.a("unc", "a", 641, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while creating WiFi Direct group");
            context = this.d;
        } catch (ExecutionException e3) {
            anih anih2 = (anih) ulh.a.d();
            anih2.a((Throwable) e3);
            ((anih) anih2.a("unc", "a", 643, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to create WiFi Direct group");
            context = this.d;
        } catch (TimeoutException e4) {
            anih anih3 = (anih) ulh.a.d();
            anih3.a((Throwable) e4);
            ((anih) anih3.a("unc", "a", 645, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting to create WiFi Direct group");
            context = this.d;
        } catch (Throwable th) {
            thp.a(this.d, (BroadcastReceiver) wifiDirect$CreateGroupOperation$1);
            throw th;
        }
        thp.a(context, (BroadcastReceiver) wifiDirect$CreateGroupOperation$1);
        return false;
    }
}
