package defpackage;

import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: oir  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oir implements nzc {
    final /* synthetic */ boolean a;
    final /* synthetic */ HelpChimeraActivity b;

    public oir(HelpChimeraActivity helpChimeraActivity, boolean z) {
        this.b = helpChimeraActivity;
        this.a = z;
    }

    public final void a(nze nze) {
        boolean z;
        HelpChimeraActivity helpChimeraActivity = this.b;
        boolean z2 = this.a;
        nzz b2 = GoogleHelpChimeraService.b(GoogleHelpChimeraService.c(helpChimeraActivity.x));
        if (b2 == null || b2.e) {
            z = true;
        } else {
            z = false;
        }
        avnq a2 = obl.a(nze);
        if (a2 != null) {
            helpChimeraActivity.x.a(a2);
        } else if (!z) {
            if (!helpChimeraActivity.n) {
                helpChimeraActivity.a(!helpChimeraActivity.t(), true);
                return;
            }
            return;
        }
        helpChimeraActivity.J();
        helpChimeraActivity.b(z2);
    }
}
