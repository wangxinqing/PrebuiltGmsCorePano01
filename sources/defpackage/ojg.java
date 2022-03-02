package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: ojg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ojg extends ojk {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;
    final /* synthetic */ GoogleHelp m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ojg(icc icc, FeedbackOptions feedbackOptions, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(icc);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
        this.m = googleHelp;
    }

    /* access modifiers changed from: protected */
    public final void a(ojt ojt) {
        try {
            ojt.a(this.a, this.b, this.c, this.m, new ojf(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            c(ojl.a);
        }
    }
}
