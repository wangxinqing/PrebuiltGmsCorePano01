package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.google.android.gms.nearby.discovery.fastpair.battery.BatteryAdvertisement;

/* renamed from: txa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class txa implements aryw {
    final /* synthetic */ txb a;

    public txa(txb txb) {
        this.a = txb;
    }

    public final void a() {
    }

    public final void a(int i, BluetoothProfile bluetoothProfile) {
    }

    public final void a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
        if (i3 == 0) {
            String address = bluetoothDevice.getAddress();
            if (!this.a.b(address)) {
                txb txb = this.a;
                for (BatteryAdvertisement batteryAdvertisement : txb.b.values()) {
                    if (address.equals(batteryAdvertisement.a)) {
                        txb.a.a(address);
                        batteryAdvertisement.r = true;
                        return;
                    }
                }
            }
        }
    }
}
