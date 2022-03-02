package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* renamed from: aegc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aegc extends aegd {
    public aegc(Context context, aeia aeia, BluetoothDevice bluetoothDevice, String... strArr) {
        super(context, aeia, bluetoothDevice, strArr);
    }

    /* access modifiers changed from: protected */
    public final void b(Intent intent) {
        close();
    }
}
