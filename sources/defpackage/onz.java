package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.service.GoogleHelpChimeraService;

/* renamed from: onz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class onz extends ons {
    private final long f;
    private final Bundle g;
    private final GoogleHelp h;
    private final FeedbackOptions i;

    public onz(GoogleHelpChimeraService googleHelpChimeraService, String str, ojq ojq, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super("SaveAsyncFeedbackPsbdOperation", googleHelpChimeraService, str, ojq);
        this.i = feedbackOptions;
        this.g = bundle;
        this.f = j;
        this.h = googleHelp;
    }

    public final void a(Context context) {
        ofx.a(this.f, this.i, this.g, this.a, this.h);
        this.e.b();
    }
}
