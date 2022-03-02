package defpackage;

import android.os.SystemClock;

/* renamed from: asjy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class asjy extends arwm {
    final /* synthetic */ askc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public asjy(askc askc, String str) {
        super(str);
        this.a = askc;
    }

    public final void run() {
        if (!this.a.b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            askc askc = this.a;
            if (elapsedRealtime - askc.g <= 5000) {
                askc.c.a(this, 100);
                return;
            }
            askc.a();
            jjg jjg = asil.a;
            return;
        }
        this.a.a();
        jjg jjg2 = asil.a;
    }
}
