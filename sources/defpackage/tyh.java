package defpackage;

import android.bluetooth.BluetoothSocket;

/* renamed from: tyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class tyh implements Runnable {
    private final tyt a;
    private final BluetoothSocket b;

    public tyh(tyt tyt, BluetoothSocket bluetoothSocket) {
        this.a = tyt;
        this.b = bluetoothSocket;
    }

    public final void run() {
        tyt tyt = this.a;
        tyt.a(this.b);
        tyt.e();
    }
}
