package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.Iterator;

/* renamed from: tpq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tpq implements Runnable {
    private final tps a;
    private final BluetoothDevice b;

    public tpq(tps tps, BluetoothDevice bluetoothDevice) {
        this.a = tps;
        this.b = bluetoothDevice;
    }

    public final void run() {
        tps tps = this.a;
        BluetoothDevice bluetoothDevice = this.b;
        String name = bluetoothDevice.getName();
        if (!tps.a.k()) {
            ((anih) tky.a.c()).a("Skipping discovery of BluetoothDevice %s because we are no longer discovering.", (Object) name);
            return;
        }
        tnd a2 = tnd.a(name);
        if (tps.a(a2)) {
            tql tql = tps.e;
            String str = a2.c;
            String address = bluetoothDevice.getAddress();
            tpp tpp = tql.l;
            tmq tmq = null;
            if (tpp != null) {
                Iterator it = tpp.e.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    tmq tmq2 = (tmq) it.next();
                    if (!str.equals(tmq2.b) && ampw.a(address, tmq2.a.getAddress())) {
                        tmq = tmq2;
                        break;
                    }
                }
            }
            if (tmq == null) {
                ((anih) tky.a.d()).a("Found BluetoothDeviceName %s (with EndpointId %s and EndpointInfo %s)", (Object) name, (Object) a2.c, (Object) tky.a(a2.e));
                tmq tmq3 = new tmq(bluetoothDevice, a2.c, a2.e, tps.b);
                tps.d.put(name, tmq3);
                tps.e.b(tps.a, (tms) tmq3);
                tps.e.a(tps.a, a2.c, asoe.BLUETOOTH, 1);
                return;
            }
            ((anih) tky.a.c()).a("Found duplicated Bluetooth endpoint from BLE's cache which have same MAC address (%s) but different endpointId (%s)/(%s)", (Object) bluetoothDevice.getAddress(), (Object) a2.c, (Object) tmq.b);
        } else if (tps.a.m() != null && tps.a.m().b) {
            jjg jjg = tky.a;
            tps.a.a(tps.b, bluetoothDevice);
        }
    }
}
