package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.CountDownLatch;

/* renamed from: arwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class arwz implements ServiceConnection {
    final /* synthetic */ arxb a;

    public arwz(arxb arxb) {
        this.a = arxb;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        arxw arxw;
        ((anih) ((anih) aryq.a.d()).a("arwz", "onServiceConnected", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: DeviceStatusServiceConnUtil connected with DiscoveryService");
        synchronized (this.a) {
            arxb arxb = this.a;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.location.nearby.common.fastpair.IDeviceStatusService");
                arxw = !(queryLocalInterface instanceof arxw) ? new arxu(iBinder) : (arxw) queryLocalInterface;
            } else {
                arxw = null;
            }
            arxb.a = arxw;
        }
        this.a.d.a();
        this.a.b.countDown();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a) {
            arxb arxb = this.a;
            arxb.a = null;
            if (!arxb.c) {
                ((anih) ((anih) aryq.a.d()).a("arwz", "onServiceDisconnected", 78, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: DeviceStatusServiceConnUtil disconnected with DiscoveryService when service stopped, ignore.");
            } else {
                arxb.c = false;
                arxb.a();
                ((anih) ((anih) aryq.a.d()).a("arwz", "onServiceDisconnected", 75, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPair: DeviceStatusServiceConnUtil disconnected with DiscoveryService accidentally, start service again!");
            }
        }
        this.a.d.b();
        this.a.b = new CountDownLatch(1);
    }
}
