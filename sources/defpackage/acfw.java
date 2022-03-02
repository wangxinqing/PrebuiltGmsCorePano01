package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.google.android.gms.smartdevice.fastpair.FastPairNotificationIntentOperation;
import java.util.concurrent.ExecutionException;

/* renamed from: acfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfw extends BluetoothGattCallback {
    final /* synthetic */ FastPairNotificationIntentOperation a;

    public acfw(FastPairNotificationIntentOperation fastPairNotificationIntentOperation) {
        this.a = fastPairNotificationIntentOperation;
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        iwd iwd = FastPairNotificationIntentOperation.a;
        StringBuilder sb = new StringBuilder(35);
        sb.append("onCharacteristicRead(): ");
        sb.append(i);
        iwd.b(sb.toString(), new Object[0]);
        if (i == 0 && bluetoothGattCharacteristic.getUuid().equals(acfu.b)) {
            this.a.c.a((Object) new String(bluetoothGattCharacteristic.getValue(), acfu.d));
        }
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            FastPairNotificationIntentOperation.a.b("Disconnected from GATT server.", new Object[0]);
            this.a.c.b((Exception) new ExecutionException(new Exception("Disconnected from Gatt server.")));
        } else if (i2 != 2) {
            iwd iwd = FastPairNotificationIntentOperation.a;
            StringBuilder sb = new StringBuilder(29);
            sb.append("connection state: ");
            sb.append(i2);
            iwd.b(sb.toString(), new Object[0]);
        } else {
            boolean discoverServices = bluetoothGatt.discoverServices();
            iwd iwd2 = FastPairNotificationIntentOperation.a;
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Discovering services: ");
            sb2.append(discoverServices);
            iwd2.b(sb2.toString(), new Object[0]);
        }
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCharacteristic characteristic;
        if (i != 0) {
            iwd iwd = FastPairNotificationIntentOperation.a;
            StringBuilder sb = new StringBuilder(42);
            sb.append("onServicesDiscovered received: ");
            sb.append(i);
            iwd.d(sb.toString(), new Object[0]);
            return;
        }
        FastPairNotificationIntentOperation.a.b("onServicesDiscovered()", new Object[0]);
        BluetoothGattService service = bluetoothGatt.getService(acfu.a);
        if (service != null && (characteristic = service.getCharacteristic(acfu.b)) != null) {
            bluetoothGatt.readCharacteristic(characteristic);
        }
    }
}
