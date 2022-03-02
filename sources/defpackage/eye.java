package defpackage;

import android.os.CountDownTimer;
import android.os.SystemClock;

/* renamed from: eye  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class eye {
    public final CountDownTimer a = new eyc(this, awnv.b());
    public long b;
    final /* synthetic */ eyf c;

    public eye(eyf eyf) {
        this.c = eyf;
    }

    public final aorr a() {
        long c2 = awnv.c();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        long j2 = c2 - (elapsedRealtime - j);
        if (j != 0 && j2 >= 0) {
            aosh f = aosh.f();
            new eyd(j2, f).start();
            return f;
        }
        this.a.cancel();
        return aorl.a((Object) null);
    }
}
