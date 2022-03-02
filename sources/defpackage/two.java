package defpackage;

import android.bluetooth.BluetoothDevice;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: two  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class two implements Runnable {
    private final tws a;
    private final BluetoothDevice b;
    private final String c;

    public two(tws tws, BluetoothDevice bluetoothDevice, String str) {
        this.a = tws;
        this.b = bluetoothDevice;
        this.c = str;
    }

    public final void run() {
        tws tws = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        String str = this.c;
        twr b2 = tws.b(bluetoothDevice);
        String str2 = b2.b;
        if (!str.equals(str2)) {
            if (b2.d > 0) {
                ((anih) tsp.a.d()).a("RetroactivePairManager: the ble address changed (%s -> %s)", (Object) b2.b, (Object) str);
            }
            b2.e = true;
            b2.b = str;
        }
        if (b2.e && b2.d > 0 && str2 != null) {
            tws.a.startService(DiscoveryChimeraService.a(tws.a).setAction("com.google.android.gms.nearby.discovery:ACTION_CANCEL_FAST_PAIR").putExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS", str2));
        }
    }
}
