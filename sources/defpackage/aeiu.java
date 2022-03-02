package defpackage;

import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeiu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeiu extends aekj {
    final /* synthetic */ BluetoothGattDescriptor a;
    final /* synthetic */ aeiy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeiu(aeiy aeiy, Object[] objArr, BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(objArr);
        this.b = aeiy;
        this.a = bluetoothGattDescriptor;
    }

    public final void a() {
        aejx aejx = this.b.d;
        if (!aejx.a.readDescriptor(this.a)) {
            throw new BluetoothException("gatt.readDescriptor returned false.");
        }
    }
}
