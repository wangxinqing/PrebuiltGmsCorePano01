package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.os.Build;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: acft  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acft extends BluetoothGattServerCallback {
    final /* synthetic */ acfu a;

    public acft(acfu acfu) {
        this.a = acfu;
    }

    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        acfu acfu = this.a;
        UUID uuid = acfu.a;
        BluetoothGattServer bluetoothGattServer = acfu.h;
        if (bluetoothGattServer == null) {
            acfu.j.d("Bluetooth Gatt Server is null.", new Object[0]);
            return;
        }
        acfu.j.b("onCharacteristicReadRequest()", new Object[0]);
        if (acfu.b.equals(bluetoothGattCharacteristic.getUuid())) {
            bluetoothGattServer.sendResponse(bluetoothDevice, i, 0, 0, Build.MODEL.getBytes(acfu.d));
            iwd iwd = acfu.j;
            String valueOf = String.valueOf(Arrays.toString(Build.MODEL.getBytes()));
            iwd.b(valueOf.length() == 0 ? new String("Device Name: ") : "Device Name: ".concat(valueOf), new Object[0]);
            return;
        }
        iwd iwd2 = acfu.j;
        String valueOf2 = String.valueOf(bluetoothGattCharacteristic.getUuid());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 29);
        sb.append("Invalid Characteristic Read: ");
        sb.append(valueOf2);
        iwd2.d(sb.toString(), new Object[0]);
        bluetoothGattServer.sendResponse(bluetoothDevice, i, 257, 0, new byte[0]);
    }

    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        if (i2 == 0) {
            acfu.j.b("Disconnected from GATT server.", new Object[0]);
        } else if (i2 != 2) {
            iwd iwd = acfu.j;
            StringBuilder sb = new StringBuilder(29);
            sb.append("connection state: ");
            sb.append(i2);
            iwd.b(sb.toString(), new Object[0]);
        } else {
            acfu.j.b("Connected to GATT server.", new Object[0]);
        }
    }
}
