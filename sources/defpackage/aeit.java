package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeit  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeit extends aekj {
    final /* synthetic */ BluetoothGattCharacteristic a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ aeiy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeit(aeiy aeiy, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte... bArr) {
        super(objArr);
        this.c = aeiy;
        this.a = bluetoothGattCharacteristic;
        this.b = bArr;
    }

    public final void a() {
        BluetoothGattCharacteristic a2 = aekh.a(this.a);
        a2.setValue(this.b);
        if (!this.c.d.a(a2)) {
            throw new BluetoothException("gatt.writeCharacteristic returned false.");
        }
    }
}
