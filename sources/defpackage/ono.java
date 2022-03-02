package defpackage;

import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: ono  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ono implements nzc {
    final /* synthetic */ avnq a;
    final /* synthetic */ HelpConfig b;

    public ono(avnq avnq, HelpConfig helpConfig) {
        this.a = avnq;
        this.b = helpConfig;
    }

    public final void a(nze nze) {
        obl.a(this.a, nze);
        GoogleHelpChimeraService.b(this.b);
    }
}
