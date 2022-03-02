package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: aejy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aejy extends BluetoothGattCallback {
    final /* synthetic */ aejz a;

    public aejy(aejz aejz) {
        this.a = aejz;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.a.a(aejx.a(bluetoothGatt), bluetoothGattCharacteristic);
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.a.a(aejx.a(bluetoothGatt), bluetoothGattCharacteristic, i);
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.a.b(aejx.a(bluetoothGatt), bluetoothGattCharacteristic, i);
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.a.a(aejx.a(bluetoothGatt), i, i2);
    }

    public final void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.a.a(aejx.a(bluetoothGatt), bluetoothGattDescriptor, i);
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        this.a.b(aejx.a(bluetoothGatt), bluetoothGattDescriptor, i);
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.a.b(aejx.a(bluetoothGatt), i, i2);
    }

    public final void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
        this.a.c(aejx.a(bluetoothGatt), i, i2);
    }

    public final void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
        this.a.b(aejx.a(bluetoothGatt), i);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        this.a.a(aejx.a(bluetoothGatt), i);
    }
}
