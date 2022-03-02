package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aeiw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeiw extends aekk {
    final /* synthetic */ BluetoothGattCharacteristic a;
    final /* synthetic */ aeiy b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeiw(aeiy aeiy, Object[] objArr, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(objArr);
        this.b = aeiy;
        this.a = bluetoothGattCharacteristic;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        boolean z;
        String str;
        aeix aeix = new aeix();
        this.b.i.put(this.a, aeix);
        aeiy aeiy = this.b;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.a;
        int properties = bluetoothGattCharacteristic.getProperties();
        if ((properties & 16) != 0) {
            z = false;
        } else if ((properties & 32) != 0) {
            z = true;
        } else {
            throw new BluetoothException(String.format("%s on device %s supports neither notifications nor indications.", new Object[]{aekh.b(bluetoothGattCharacteristic), aeiy.d.a()}));
        }
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(aeer.a);
        if (descriptor != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr = new Object[3];
            objArr[0] = "Enabling";
            if (!z) {
                str = "notification";
            } else {
                str = "indication";
            }
            objArr[1] = str;
            objArr[2] = bluetoothGattCharacteristic.getUuid();
            aeiy.d.b(bluetoothGattCharacteristic);
            byte[] bArr = z ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
            Object[] objArr2 = {Integer.valueOf(bArr.length), aekh.b(descriptor), aeiy.d.a()};
            long currentTimeMillis2 = System.currentTimeMillis();
            try {
                long j = currentTimeMillis;
                aeiy.e.b((aekj) new aeiv(aeiy, new Object[]{aeje.WRITE_DESCRIPTOR, aeiy.d, descriptor}, descriptor, bArr), aeiy.k);
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                new Object[1][0] = Long.valueOf(System.currentTimeMillis() - j);
                return aeix;
            } catch (BluetoothException e) {
                throw new BluetoothException(String.format("Failed to write %s on device %s.", new Object[]{aekh.b(descriptor), aeiy.d.a()}), e);
            }
        } else {
            throw new BluetoothException(String.format("%s on device %s is missing client config descriptor.", new Object[]{aekh.b(bluetoothGattCharacteristic), aeiy.d.a()}));
        }
    }
}
