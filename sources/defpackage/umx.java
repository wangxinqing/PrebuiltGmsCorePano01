package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pConfig;
import com.google.android.gms.nearby.mediums.WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1;
import java.net.InetAddress;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: umx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class umx implements Runnable {
    public InetAddress a;
    final /* synthetic */ WifiP2pConfig b;
    final /* synthetic */ String c;
    final /* synthetic */ umz d;

    public umx(umz umz, WifiP2pConfig wifiP2pConfig, String str) {
        this.d = umz;
        this.b = wifiP2pConfig;
        this.c = str;
    }

    public final void run() {
        aosh f = aosh.f();
        WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1 = new WifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1("nearby", f);
        this.d.a.registerReceiver(wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1, new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE"));
        umz umz = this.d;
        umz.b.connect(umz.d, this.b, new umw(this, f));
        try {
            this.a = (InetAddress) f.get(aymi.ab(), TimeUnit.SECONDS);
            jjg jjg = ulh.a;
            thp.a(this.d.a, (BroadcastReceiver) wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(String.format("Interrupted while connecting to %s", new Object[]{this.c}), e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(String.format("Failed to connect to %s", new Object[]{this.c}), e2);
        } catch (TimeoutException e3) {
            throw new RuntimeException(String.format("Timed out waiting to connect to %s", new Object[]{this.c}), e3);
        } catch (Throwable th) {
            thp.a(this.d.a, (BroadcastReceiver) wifiDirect$ConnectOperation$1ConnectToWifiP2pDeviceRunnable$1);
            throw th;
        }
    }
}
