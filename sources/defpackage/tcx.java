package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: tcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class tcx extends AdvertiseCallback {
    public final CountDownLatch a = new CountDownLatch(1);
    public boolean b;

    public final boolean a(long j) {
        try {
            if (this.a.await(j, TimeUnit.MILLISECONDS)) {
                return this.b;
            }
            return false;
        } catch (InterruptedException e) {
            ((anih) ((anih) tcz.a.c()).a("tcx", "a", 223, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: Timed out waiting for BLE advertising to start");
            return false;
        }
    }

    public final void onStartFailure(int i) {
        ((anih) ((anih) tcz.a.b()).a("tcx", "onStartFailure", 230, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothTargetDevice: Failed to start BLE advertise: %d", i);
        this.b = false;
        this.a.countDown();
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        anil anil = tcz.a;
        this.b = true;
        this.a.countDown();
    }
}
