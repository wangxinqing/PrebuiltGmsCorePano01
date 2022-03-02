package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: ojy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ojy implements Runnable {
    private final HelpChimeraActivity a;

    public ojy(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final void run() {
        this.a.onBackPressed();
    }
}
