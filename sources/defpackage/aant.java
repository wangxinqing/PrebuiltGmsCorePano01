package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.concurrent.CountDownLatch;

/* renamed from: aant  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aant extends zzv {
    final /* synthetic */ aanv[] a;
    final /* synthetic */ CountDownLatch b;

    public aant(aanv[] aanvArr, CountDownLatch countDownLatch) {
        this.a = aanvArr;
        this.b = countDownLatch;
    }

    public final void a(Status status, HarmfulAppsInfo harmfulAppsInfo) {
        if (!(status == null || !status.c() || harmfulAppsInfo == null)) {
            this.a[0] = new aanv(harmfulAppsInfo);
        }
        this.b.countDown();
    }
}
