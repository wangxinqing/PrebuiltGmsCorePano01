package defpackage;

import android.os.CountDownTimer;

/* renamed from: adpi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adpi extends CountDownTimer {
    final /* synthetic */ ador a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adpi(long j, long j2, ador ador) {
        super(j, j2);
        this.a = ador;
    }

    public final void onFinish() {
        this.a.p();
    }

    public final void onTick(long j) {
    }
}
