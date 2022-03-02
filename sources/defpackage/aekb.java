package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;

/* renamed from: aekb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aekb extends BluetoothGattServerCallback {
    final /* synthetic */ aekc a;

    public aekb(aekc aekc) {
        this.a = aekc;
    }

    public final void onCharacteristicReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.a.a(aejw.a(bluetoothDevice), i, i2, bluetoothGattCharacteristic);
    }

    public final void onCharacteristicWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, byte[] bArr) {
        this.a.a(aejw.a(bluetoothDevice), i, bluetoothGattCharacteristic, z, z2, i2, bArr);
    }

    public final void onConnectionStateChange(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.a.a(aejw.a(bluetoothDevice), i, i2);
    }

    public final void onDescriptorReadRequest(BluetoothDevice bluetoothDevice, int i, int i2, BluetoothGattDescriptor bluetoothGattDescriptor) {
        this.a.a(aejw.a(bluetoothDevice), i, i2, bluetoothGattDescriptor);
    }

    public final void onDescriptorWriteRequest(BluetoothDevice bluetoothDevice, int i, BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, byte[] bArr) {
        this.a.a(aejw.a(bluetoothDevice), i, bluetoothGattDescriptor, z, z2, i2, bArr);
    }

    public final void onExecuteWrite(BluetoothDevice bluetoothDevice, int i, boolean z) {
        this.a.a(aejw.a(bluetoothDevice), i, z);
    }

    public final void onMtuChanged(BluetoothDevice bluetoothDevice, int i) {
        this.a.b(aejw.a(bluetoothDevice), i);
    }

    public final void onNotificationSent(BluetoothDevice bluetoothDevice, int i) {
        this.a.a(aejw.a(bluetoothDevice), i);
    }

    public final void onServiceAdded(int i, BluetoothGattService bluetoothGattService) {
        this.a.a(i, bluetoothGattService);
    }
}
