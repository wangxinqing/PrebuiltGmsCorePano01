package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: ont  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ont extends ons {
    private final HelpConfig f;
    private final aoru g;

    public ont(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, HelpConfig helpConfig, aoru aoru) {
        super("GetEscalationOptionsOperation", googleHelpChimeraService, str, ojq);
        this.f = helpConfig;
        this.g = aoru;
    }

    public final void a(Context context) {
        int i;
        avnq a = obh.a(context.getApplicationContext(), this.f, this.g, this.a.a());
        if (a == null) {
            Log.e("gH_GetEscalationOp", "No escalation options returned");
            this.e.g();
            i = 22;
        } else {
            this.e.b(a.k());
            i = 21;
        }
        MetricsIntentOperation.a(context, this.f.e, this.d, 126, i, false);
    }
}
