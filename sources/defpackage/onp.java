package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class onp implements obj {
    final /* synthetic */ GoogleHelpChimeraService a;

    public onp(GoogleHelpChimeraService googleHelpChimeraService) {
        this.a = googleHelpChimeraService;
    }

    public final Context a() {
        return this.a.getApplicationContext();
    }

    public final void a(avnq avnq, HelpConfig helpConfig) {
        if (avnq != null) {
            this.a.a((nzc) new ono(avnq, helpConfig));
        } else {
            GoogleHelpChimeraService.b(helpConfig);
        }
    }
}
