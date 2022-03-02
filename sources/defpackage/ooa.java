package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: ooa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ooa extends ons {
    private final long f;
    private final Bundle g;
    private final GoogleHelp h;

    public ooa(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, long j, Bundle bundle, GoogleHelp googleHelp) {
        super("SaveAsyncFeedbackPsdOperation", googleHelpChimeraService, str, ojq);
        this.f = j;
        this.g = bundle;
        this.h = googleHelp;
    }

    public final void a(Context context) {
        ofx.a(this.f, this.g, (Context) this.a, this.h);
        this.e.a();
    }
}
