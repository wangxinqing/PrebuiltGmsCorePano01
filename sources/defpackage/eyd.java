package defpackage;

import android.os.CountDownTimer;

/* renamed from: eyd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eyd extends CountDownTimer {
    final /* synthetic */ aosh a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eyd(long j, aosh aosh) {
        super(j, 50);
        this.a = aosh;
    }

    public final void onFinish() {
        this.a.b((Object) null);
    }

    public final void onTick(long j) {
    }
}
