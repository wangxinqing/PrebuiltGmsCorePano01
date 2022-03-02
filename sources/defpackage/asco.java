package defpackage;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: asco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asco extends AdvertiseCallback {
    public final CountDownLatch a = new CountDownLatch(1);
    public boolean b;

    /* access modifiers changed from: package-private */
    public final int a(long j) {
        try {
            if (this.a.await(j, TimeUnit.MILLISECONDS)) {
                return !this.b ? 1 : 0;
            }
            return 2;
        } catch (InterruptedException e) {
            ((anih) ((anih) asil.a.c()).a("asco", "a", 143, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BleAdvertiseImplL: timed out waiting for advertising to start");
            return 2;
        }
    }

    public final void onStartFailure(int i) {
        String str;
        anih anih = (anih) ((anih) asil.a.b()).a("asco", "onStartFailure", 150, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)");
        if (i == 1) {
            str = "ADVERTISE_FAILED_DATA_TOO_LARGE";
        } else if (i == 2) {
            str = "ADVERTISE_FAILED_TOO_MANY_ADVERTISERS";
        } else if (i == 3) {
            str = "ADVERTISE_FAILED_ALREADY_STARTED";
        } else if (i == 4) {
            str = "ADVERTISE_FAILED_INTERNAL_ERROR";
        } else if (i != 5) {
            StringBuilder sb = new StringBuilder(21);
            sb.append("UNKNOWN (");
            sb.append(i);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "ADVERTISE_FAILED_FEATURE_UNSUPPORTED";
        }
        anih.a("BleAdvertiseImplL: Failed to start, error code: %s", (Object) str);
        this.b = false;
        this.a.countDown();
    }

    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        jjg jjg = asil.a;
        this.b = true;
        this.a.countDown();
    }
}
