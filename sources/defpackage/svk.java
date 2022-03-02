package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: svk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class svk implements Runnable {
    final /* synthetic */ svv a;
    final /* synthetic */ long b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ Context d;
    final /* synthetic */ sut e;
    final /* synthetic */ BroadcastReceiver.PendingResult f;

    public svk(svv svv, long j, Bundle bundle, Context context, sut sut, BroadcastReceiver.PendingResult pendingResult) {
        this.a = svv;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = sut;
        this.f = pendingResult;
    }

    public final void run() {
        long a2 = this.a.a().i.a();
        long j = this.b;
        if (a2 > 0 && (j >= a2 || j <= 0)) {
            j = -1 + a2;
        }
        if (j > 0) {
            this.c.putLong("click_timestamp", j);
        }
        this.c.putString("_cis", "referrer broadcast");
        svv.a(this.d).e().a("auto", "_cmp", this.c);
        this.e.k.a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
