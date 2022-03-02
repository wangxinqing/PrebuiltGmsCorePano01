package defpackage;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: fev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class fev extends CountDownTimer {
    final /* synthetic */ fex a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fev(fex fex, long j) {
        super(j, 50);
        this.a = fex;
    }

    public final void onFinish() {
        this.a.c.i.c(1);
        this.a.b = SystemClock.elapsedRealtime();
    }

    public final void onTick(long j) {
    }
}
