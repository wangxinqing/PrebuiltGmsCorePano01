package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeis  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeis extends aekj {
    final /* synthetic */ BluetoothGattCharacteristic a;
    final /* synthetic */ aeiy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeis(aeiy aeiy, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.b = aeiy;
        this.a = bluetoothGattCharacteristic;
    }

    public final void a() {
        aejx aejx = this.b.d;
        if (!aejx.a.readCharacteristic(this.a)) {
            throw new BluetoothException("gatt.readCharacteristic returned false.");
        }
    }
}
