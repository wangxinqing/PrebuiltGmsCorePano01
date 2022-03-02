package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;

/* renamed from: aryu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aryu implements aryw {
    final /* synthetic */ int a;
    final /* synthetic */ aosh b;

    public aryu(int i, aosh aosh) {
        this.a = i;
        this.b = aosh;
    }

    public final void a() {
    }

    public final void a(int i, int i2, int i3, BluetoothDevice bluetoothDevice) {
    }

    public final void a(int i, BluetoothProfile bluetoothProfile) {
        if (i == this.a && bluetoothProfile != null) {
            this.b.b((Object) bluetoothProfile.getConnectedDevices());
        }
    }
}
