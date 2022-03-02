package defpackage;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: eyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eyc extends CountDownTimer {
    final /* synthetic */ eye a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eyc(eye eye, long j) {
        super(j, 50);
        this.a = eye;
    }

    public final void onFinish() {
        eyf eyf = this.a.c;
        iwd iwd = eyf.c;
        eyf.k.c(1);
        this.a.b = SystemClock.elapsedRealtime();
    }

    public final void onTick(long j) {
    }
}
