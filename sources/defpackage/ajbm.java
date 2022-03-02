package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;

/* renamed from: ajbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajbm extends aizo {
    public final ParcelUuid[] j() {
        return this.b.getUuids();
    }

    public ajbm(BluetoothDevice bluetoothDevice) {
        super(bluetoothDevice);
    }
}
