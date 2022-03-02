package defpackage;

import android.bluetooth.BluetoothAdapter;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: acse  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acse implements Callable {
    final /* synthetic */ BluetoothAdapter a;
    final /* synthetic */ BluetoothAdapter.LeScanCallback b;
    final /* synthetic */ long c;

    public acse(BluetoothAdapter bluetoothAdapter, BluetoothAdapter.LeScanCallback leScanCallback, long j) {
        this.a = bluetoothAdapter;
        this.b = leScanCallback;
        this.c = j;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        this.a.startLeScan(new UUID[]{UUID.randomUUID()}, this.b);
        Thread.sleep(this.c);
        acsg.a();
        this.a.stopLeScan(this.b);
        return null;
    }
}
