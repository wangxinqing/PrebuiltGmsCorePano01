package defpackage;

import android.bluetooth.BluetoothProfile;

/* renamed from: aefa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aefa implements BluetoothProfile.ServiceListener {
    final /* synthetic */ aosh a;

    public aefa(aosh aosh) {
        this.a = aosh;
    }

    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        this.a.b((Object) bluetoothProfile);
    }

    public final void onServiceDisconnected(int i) {
        anil anil = aehd.a;
    }
}
