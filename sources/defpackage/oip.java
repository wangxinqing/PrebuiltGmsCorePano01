package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: oip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oip implements obj {
    final /* synthetic */ HelpChimeraActivity a;

    public oip(HelpChimeraActivity helpChimeraActivity) {
        this.a = helpChimeraActivity;
    }

    public final Context a() {
        return this.a.getApplicationContext();
    }

    public final void a(avnq avnq, HelpConfig helpConfig) {
        if (avnq != null) {
            this.a.a((nzc) new oio(avnq, helpConfig));
            this.a.J();
            return;
        }
        GoogleHelpChimeraService.b(helpConfig);
    }
}
