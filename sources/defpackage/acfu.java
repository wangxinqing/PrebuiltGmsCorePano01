package defpackage;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: acfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfu {
    public static final UUID a = UUID.fromString("d2c86762-1035-4d49-948b-f9447afdf495");
    public static final UUID b = UUID.fromString("f25241e6-6622-497a-b333-a68e37443243");
    public static final UUID c = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final Charset d = Charset.forName("UTF-8");
    public static final iwd j = acqa.a("FastPair", "BleAdvertiser");
    public BluetoothLeAdvertiser e;
    public final BluetoothManager f;
    public final Context g;
    public BluetoothGattServer h;
    public AdvertiseCallback i;
    public final BluetoothGattServerCallback k = new acft(this);

    public acfu(Context context) {
        this.f = (BluetoothManager) context.getSystemService("bluetooth");
        this.g = context;
    }

    public static byte[] a(int i2) {
        return new byte[]{(byte) (i2 >> 8), (byte) i2};
    }

    public final void b() {
        j.c("Stop gatt server.", new Object[0]);
        BluetoothGattServer bluetoothGattServer = this.h;
        if (bluetoothGattServer != null) {
            bluetoothGattServer.close();
            this.h = null;
        }
    }

    public final void a() {
        AdvertiseCallback advertiseCallback;
        BluetoothLeAdvertiser bluetoothLeAdvertiser = this.e;
        if (bluetoothLeAdvertiser != null && (advertiseCallback = this.i) != null) {
            bluetoothLeAdvertiser.stopAdvertising(advertiseCallback);
            this.i = null;
            j.b("stopped advertising.", new Object[0]);
        }
    }
}
