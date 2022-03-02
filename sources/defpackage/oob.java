package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: oob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oob extends ons {
    private final long f;
    private final Bundle g;
    private final GoogleHelp h;

    public oob(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, long j, Bundle bundle, GoogleHelp googleHelp) {
        super("SaveAsyncHelpPsdOperation", googleHelpChimeraService, str, ojq);
        this.f = j;
        this.g = bundle;
        this.h = googleHelp;
    }

    public final void a(Context context) {
        ofx.a(this.g, ofx.b(this.f), (Context) this.a);
        Bundle bundle = this.g;
        GoogleHelp googleHelp = this.h;
        GoogleHelpChimeraService googleHelpChimeraService = this.a;
        if (bundle.containsKey("gms:googlehelp:async_help_psd_collection_time_ms")) {
            ofx.a(137, Long.valueOf(bundle.getString("gms:googlehelp:async_help_psd_collection_time_ms")).longValue(), googleHelp, (Context) googleHelpChimeraService);
        } else if (bundle.containsKey("gms:googlehelp:async_help_psd_failure")) {
            ofx.a(105, bundle.getString("gms:googlehelp:async_help_psd_failure"), googleHelp, (Context) googleHelpChimeraService);
        }
        this.e.a();
    }
}
