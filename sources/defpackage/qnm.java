package defpackage;

import android.os.SystemClock;

/* renamed from: qnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class qnm implements acvp {
    private final long a;
    private final aucd b;

    public qnm(aucd aucd, long j) {
        this.b = aucd;
        this.a = j;
    }

    public final void a(acwa acwa) {
        aucd aucd = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        ansz ansz = ansz.k;
        ((ansz) aucd.b).i = elapsedRealtime;
        qoh.a().a((ansz) aucd.i());
    }
}
