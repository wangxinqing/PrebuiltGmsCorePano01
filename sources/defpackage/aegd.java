package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: aegd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class aegd extends aeif {
    private final BluetoothDevice a;

    protected aegd(Context context, aeia aeia, BluetoothDevice bluetoothDevice, String... strArr) {
        super(context, aeia, strArr);
        this.a = bluetoothDevice;
    }

    static aegd a(Context context, aeia aeia, BluetoothDevice bluetoothDevice, String... strArr) {
        return new aegc(context, aeia, bluetoothDevice, strArr);
    }

    /* access modifiers changed from: protected */
    public abstract void b(Intent intent);

    /* access modifiers changed from: protected */
    public final void a(Intent intent) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        BluetoothDevice bluetoothDevice2 = this.a;
        if (bluetoothDevice2 == null || bluetoothDevice2.equals(bluetoothDevice)) {
            b(intent);
        } else {
            anil anil = aehd.a;
        }
    }
}
