package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;

/* renamed from: tgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tgm {
    private static tgm b;
    public final BluetoothLeAdvertiser a;

    private tgm(BluetoothLeAdvertiser bluetoothLeAdvertiser) {
        this.a = bluetoothLeAdvertiser;
    }

    public static synchronized tgm a() {
        tgm tgm;
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        synchronized (tgm.class) {
            if (b == null) {
                tgm = null;
                try {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (!(defaultAdapter == null || (bluetoothLeAdvertiser = defaultAdapter.getBluetoothLeAdvertiser()) == null)) {
                        b = new tgm(bluetoothLeAdvertiser);
                    }
                } catch (NullPointerException e) {
                }
            }
            tgm = b;
        }
        return tgm;
    }

    public final void a(AdvertiseCallback advertiseCallback) {
        try {
            this.a.stopAdvertising(advertiseCallback);
        } catch (IllegalStateException | NullPointerException e) {
        }
    }

    public final boolean a(AdvertiseSettings advertiseSettings, AdvertiseData advertiseData, AdvertiseCallback advertiseCallback) {
        try {
            this.a.startAdvertising(advertiseSettings, advertiseData, advertiseCallback);
            return true;
        } catch (IllegalStateException | NullPointerException e) {
            return false;
        }
    }
}
