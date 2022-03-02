package defpackage;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeiv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeiv extends aekj {
    final /* synthetic */ BluetoothGattDescriptor a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ aeiy c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeiv(aeiy aeiy, Object[] objArr, BluetoothGattDescriptor bluetoothGattDescriptor, byte... bArr) {
        super(objArr);
        this.c = aeiy;
        this.a = bluetoothGattDescriptor;
        this.b = bArr;
    }

    public final void a() {
        BluetoothGattDescriptor a2 = aekh.a(this.a);
        a2.setValue(this.b);
        if (!this.c.d.a(a2)) {
            throw new BluetoothException("gatt.writeDescriptor returned false.");
        }
    }
}
