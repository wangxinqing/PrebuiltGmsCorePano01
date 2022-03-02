package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* renamed from: uke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class uke extends AdvertiseCallback {
    final /* synthetic */ aosh a;

    public uke(aosh aosh) {
        this.a = aosh;
    }

    public final void onStartFailure(int i) {
        this.a.a((Throwable) new RuntimeException(String.format("Failed to start BLE advertising due to error %s", new Object[]{ulc.a(i)})));
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        this.a.b((Object) null);
    }
}
