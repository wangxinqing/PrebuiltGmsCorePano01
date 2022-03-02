package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ogw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ogw implements Runnable {
    private final ogx a;

    public ogw(ogx ogx) {
        this.a = ogx;
    }

    public final void run() {
        ((HelpChimeraActivity) this.a.b.c).onBackPressed();
    }
}
