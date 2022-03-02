package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import java.util.List;
import java.util.UUID;

/* renamed from: aejx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejx {
    public final BluetoothGatt a;

    private aejx(BluetoothGatt bluetoothGatt) {
        this.a = bluetoothGatt;
    }

    public static aejx a(BluetoothGatt bluetoothGatt) {
        return new aejx(bluetoothGatt);
    }

    public final List b() {
        return this.a.getServices();
    }

    public final boolean c() {
        return this.a.discoverServices();
    }

    public final void d() {
        this.a.disconnect();
    }

    public final void e() {
        this.a.close();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aejx) {
            return this.a.equals(((aejx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final aejw a() {
        return aejw.a(this.a.getDevice());
    }

    public final void b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.a.setCharacteristicNotification(bluetoothGattCharacteristic, true);
    }

    public final BluetoothGattService a(UUID uuid) {
        return this.a.getService(uuid);
    }

    public final boolean b(int i) {
        return this.a.requestMtu(i);
    }

    public final boolean a(int i) {
        return this.a.requestConnectionPriority(i);
    }

    public final boolean a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.a.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public final boolean a(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return this.a.writeDescriptor(bluetoothGattDescriptor);
    }
}
