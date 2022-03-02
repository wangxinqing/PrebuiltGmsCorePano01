package defpackage;

import com.google.android.gms.fitness.result.BleDevicesResult;

/* renamed from: ylv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ylv implements Runnable {
    final /* synthetic */ BleDevicesResult a;
    final /* synthetic */ ylw b;

    public ylv(ylw ylw, BleDevicesResult bleDevicesResult) {
        this.b = ylw;
        this.a = bleDevicesResult;
    }

    public final void run() {
        ymb ymb = this.b.a;
        BleDevicesResult bleDevicesResult = this.a;
        if (bleDevicesResult.b.c()) {
            ymb.f = bleDevicesResult.a;
            ymb.b();
        } else {
            ymb.b(3);
        }
        ymb.k = null;
    }
}
