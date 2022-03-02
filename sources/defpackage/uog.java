package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.nearby.mediums.WifiHotspot$WifiDirectHotspotOperation$1;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: uog  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uog extends urq {
    private static final int[] c = {1, 6, 11};
    private static final int[] d = {36, 40, 44, 48};
    public final WifiP2pManager a;
    public unu b;
    private final Context e;
    private final WifiManager f;
    private final WifiP2pManager.ChannelListener i;
    private WifiP2pManager.Channel j;
    private final boolean k;

    public uog(Context context, WifiP2pManager wifiP2pManager, WifiP2pManager.ChannelListener channelListener, WifiManager wifiManager, boolean z) {
        super(61);
        this.e = context;
        this.a = wifiP2pManager;
        this.i = channelListener;
        this.f = wifiManager;
        this.k = z;
    }

    private static int a(Context context, int[] iArr) {
        int i2;
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != null) {
            i2 = Math.abs(string.hashCode()) % iArr.length;
        } else {
            i2 = 0;
        }
        return iArr[i2];
    }

    private final void c() {
        if (!jkr.h()) {
            a(this.j, 0, 0);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            this.j.close();
            ((anih) ((anih) ulh.a.d()).a("uog", "c", 1521, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed Wifi Direct channel.");
        }
    }

    private static final WifiP2pConfig d(int i2) {
        String format = String.format("DIRECT-%s-%s", new Object[]{ulu.a(2), ulu.a(6)});
        return new WifiP2pConfig.Builder().setNetworkName(format).setPassphrase(ulu.a(8)).setGroupOperatingBand(i2).build();
    }

    private final int g() {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        WifiInfo connectionInfo = this.f.getConnectionInfo();
        int i4 = 0;
        if (connectionInfo != null) {
            i2 = connectionInfo.getFrequency();
        } else {
            i2 = 0;
        }
        if (i2 >= 2412 && i2 <= 2472) {
            i4 = ((i2 - 2412) / 5) + 1;
        } else if (i2 >= 5005 && i2 <= 5825) {
            i4 = ((i2 - 5005) / 5) + 1;
        }
        return (i4 > 0 && i4 <= 11) ? i4 : a(this.e, c);
    }

    public final int b() {
        WifiHotspot$WifiDirectHotspotOperation$1 wifiHotspot$WifiDirectHotspotOperation$1;
        Context context;
        int frequency;
        if (aymi.a.a().R()) {
            int i2 = Build.VERSION.SDK_INT;
            if (!uwe.a(this.f) && (((frequency = this.f.getConnectionInfo().getFrequency()) >= 2400 && frequency <= 2495 && this.k) || (frequency >= 5000 && frequency <= 5855 && !this.k))) {
                if (!this.f.disconnect()) {
                    ((anih) ((anih) ulh.a.d()).a("uog", "b", 1292, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to disconnect from current WiFi before hosting a WiFi Direct Hotspot.");
                    return 3;
                }
                ((anih) ((anih) ulh.a.d()).a("uog", "b", 1296, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Disconnected from current WiFi before hosting a WiFi Direct Hotspot.");
            }
        }
        WifiP2pManager.Channel initialize = this.a.initialize(this.e, Looper.getMainLooper(), this.i);
        this.j = initialize;
        if (initialize == null) {
            ((anih) ((anih) ulh.a.b()).a("uog", "b", 1302, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Wifi Direct failed to initialize a channel.");
            return 3;
        }
        aosh f2 = aosh.f();
        wifiHotspot$WifiDirectHotspotOperation$1 = new WifiHotspot$WifiDirectHotspotOperation$1("nearby", f2);
        this.e.registerReceiver(wifiHotspot$WifiDirectHotspotOperation$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        uoc uoc = new uoc(f2);
        if (this.k) {
            WifiP2pManager.Channel channel = this.j;
            if (jkr.h()) {
                this.a.createGroup(channel, d(2), uoc);
            } else {
                a(channel, g(), a(this.e, d));
                this.a.createGroup(channel, uoc);
            }
        } else {
            WifiP2pManager.Channel channel2 = this.j;
            if (jkr.h()) {
                this.a.createGroup(channel2, d(1), uoc);
            } else {
                int g = g();
                a(channel2, g, g);
                this.a.createGroup(channel2, uoc);
            }
        }
        try {
            this.b = (unu) f2.get(aymi.a.a().bD(), TimeUnit.SECONDS);
            thp.a(this.e, (BroadcastReceiver) wifiHotspot$WifiDirectHotspotOperation$1);
            return 2;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uog", "b", 1385, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to enable Wifi Direct hotspot");
            context = this.e;
        } catch (ExecutionException e3) {
            anih anih = (anih) ulh.a.b();
            anih.a((Throwable) e3);
            ((anih) anih.a("uog", "b", 1387, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to start Wifi Direct hotspot");
            context = this.e;
        } catch (TimeoutException e4) {
            anih anih2 = (anih) ulh.a.b();
            anih2.a((Throwable) e4);
            ((anih) anih2.a("uog", "b", 1389, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out waiting for Wifi Direct hotspot to start");
            context = this.e;
        } catch (Throwable th) {
            thp.a(this.e, (BroadcastReceiver) wifiHotspot$WifiDirectHotspotOperation$1);
            throw th;
        }
        thp.a(context, (BroadcastReceiver) wifiHotspot$WifiDirectHotspotOperation$1);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.cancelConnect(this.j, new uod(countDownLatch));
        try {
            if (!countDownLatch.await(aymi.ag(), TimeUnit.SECONDS)) {
                ((anih) ((anih) ulh.a.c()).a("uog", "b", 1415, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out while waiting on latch to signal Wifi direct hotspot cancellation because of failure to start.");
            }
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            ((anih) ((anih) ulh.a.b()).a("uog", "b", 1421, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while waiting to cancel Wifi Direct hotspot");
        }
        return 3;
        return 3;
    }

    private final void a(WifiP2pManager.Channel channel, int i2, int i3) {
        if (aymi.a.a().O() && uwe.a(this.f) && Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                tgf.a((Object) this.a).a("setWifiP2pChannels", WifiP2pManager.Channel.class, Integer.TYPE, Integer.TYPE, WifiP2pManager.ActionListener.class).a(channel, Integer.valueOf(i2), Integer.valueOf(i3), new uof(countDownLatch));
            } catch (tgg e2) {
                anih anih = (anih) ulh.a.b();
                anih.a((Throwable) e2);
                ((anih) anih.a("uog", "a", 1656, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set Wifi Direct channels.");
                countDownLatch.countDown();
            }
            try {
                countDownLatch.await(aymi.a.a().bC(), TimeUnit.SECONDS);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                ((anih) ((anih) ulh.a.b()).a("uog", "a", 1666, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while setting Wifi Direct channels");
            }
        }
    }

    public final void a() {
        if (this.j != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            WifiP2pManager.Channel channel = this.j;
            this.a.requestGroupInfo(channel, new uob(this, countDownLatch, channel));
            try {
                if (!countDownLatch.await(aymi.ag(), TimeUnit.SECONDS)) {
                    ((anih) ((anih) ulh.a.c()).a("uog", "a", 1477, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Timed out while waiting on latch to signal successful stopping of Wifi direct hotspot.");
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ((anih) ((anih) ulh.a.b()).a("uog", "a", 1483, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Interrupted while disabling Wifi Direct hotspot.");
            }
            if (!jkr.h()) {
                a(this.j, 0, 0);
            }
            if (Build.VERSION.SDK_INT >= 27) {
                this.j.close();
                ((anih) ((anih) ulh.a.d()).a("uog", "c", 1521, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Closed Wifi Direct channel.");
            }
            this.j = null;
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uog", "a", 1431, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop Wifi Direct hotspot because there is no Wifi Direct Channel.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(CountDownLatch countDownLatch, WifiP2pManager.Channel channel, WifiP2pGroup wifiP2pGroup) {
        if (wifiP2pGroup != null && wifiP2pGroup.isGroupOwner()) {
            this.a.removeGroup(channel, new uoe(countDownLatch));
            return;
        }
        ((anih) ((anih) ulh.a.d()).a("uog", "a", 1448, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to stop Wifi Direct hotspot because no group was found.");
        countDownLatch.countDown();
    }
}
