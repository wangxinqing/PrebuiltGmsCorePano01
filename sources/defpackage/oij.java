package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: oij  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class oij implements Runnable {
    private final HelpChimeraActivity a;
    private final boolean b;
    private final boolean c;

    public oij(HelpChimeraActivity helpChimeraActivity, boolean z, boolean z2) {
        this.a = helpChimeraActivity;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        HelpChimeraActivity helpChimeraActivity = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        String c2 = GoogleHelpChimeraService.c(helpChimeraActivity.x);
        helpChimeraActivity.a(c2, GoogleHelpChimeraService.b(c2), z, z2);
    }
}
