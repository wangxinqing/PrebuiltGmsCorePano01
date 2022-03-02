package defpackage;

import android.os.CountDownTimer;

/* renamed from: ewh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ewh extends CountDownTimer {
    final /* synthetic */ ewj a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ewh(ewj ewj, long j) {
        super(j, 100);
        this.a = ewj;
    }

    public final void onFinish() {
        this.a.f.a();
    }

    public final void onTick(long j) {
    }
}
