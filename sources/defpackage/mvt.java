package defpackage;

import android.content.Intent;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvt {
    final /* synthetic */ ErrorReport a;
    final /* synthetic */ Intent b;
    final /* synthetic */ FeedbackChimeraActivity c;

    public mvt(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, Intent intent) {
        this.c = feedbackChimeraActivity;
        this.a = errorReport;
        this.b = intent;
    }

    public final void a() {
        a(120, this.a);
        this.c.b(this.b);
    }

    public final void a(int i, ErrorReport errorReport) {
        this.c.a(i, errorReport);
    }
}
