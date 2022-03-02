package defpackage;

import com.google.android.gms.droidguard.DroidGuardChimeraService;

/* renamed from: lxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class lxx implements Runnable {
    final /* synthetic */ lxy a;

    public lxx(lxy lxy) {
        this.a = lxy;
    }

    public final void run() {
        DroidGuardChimeraService droidGuardChimeraService = this.a.a;
        anax anax = DroidGuardChimeraService.a;
        droidGuardChimeraService.c.a();
    }
}
