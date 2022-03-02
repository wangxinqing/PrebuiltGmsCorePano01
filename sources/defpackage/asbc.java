package defpackage;

import android.bluetooth.BluetoothGattService;

/* renamed from: asbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asbc extends aekc {
    final /* synthetic */ asbe a;

    public asbc(asbe asbe) {
        this.a = asbe;
    }

    public final void a(int i, BluetoothGattService bluetoothGattService) {
        this.a.a.h.countDown();
    }
}
