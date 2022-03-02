package defpackage;

import android.bluetooth.BluetoothGattService;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aejo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aejo extends aekj {
    final /* synthetic */ aeka a;
    final /* synthetic */ BluetoothGattService b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aejo(Object[] objArr, aeka aeka, BluetoothGattService bluetoothGattService) {
        super(objArr);
        this.a = aeka;
        this.b = bluetoothGattService;
    }

    public final void a() {
        if (!this.a.a(this.b)) {
            throw new BluetoothException("Fails on adding service");
        }
    }
}
