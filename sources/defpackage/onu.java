package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onu extends ons {
    private final HelpConfig f;

    public onu(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, HelpConfig helpConfig) {
        super("GetRealtimeSupportStatusOperation", googleHelpChimeraService, str, ojq);
        this.f = helpConfig;
    }

    public final void a(Context context) {
        int i;
        avob a = ocp.a(context, this.f, this.a.a());
        if (a == null) {
            this.e.h();
            i = 22;
        } else {
            this.e.c(a.k());
            i = 21;
        }
        MetricsIntentOperation.a(context, this.f.e, this.d, 149, i, false);
    }
}
