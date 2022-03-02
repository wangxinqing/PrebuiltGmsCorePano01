package defpackage;

import android.os.CountDownTimer;

/* renamed from: adpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adpl extends CountDownTimer {
    final /* synthetic */ adjg a;
    final /* synthetic */ ador b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adpl(long j, long j2, adjg adjg, ador ador) {
        super(j, j2);
        this.a = adjg;
        this.b = ador;
    }

    public final void onFinish() {
        adpm.a.a("Re-checkin", new Object[0]);
        this.a.r();
        this.b.k();
        this.b.o();
    }

    public final void onTick(long j) {
    }
}
