package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class mvb extends mvc {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mvb(icc icc, FeedbackOptions feedbackOptions, Bundle bundle, long j) {
        super(icc);
        this.a = feedbackOptions;
        this.b = bundle;
        this.c = j;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        mye mye = (mye) ibf;
        try {
            FeedbackOptions feedbackOptions = this.a;
            Bundle bundle = this.b;
            long j = this.c;
            myo.a(bundle);
            myo.a(feedbackOptions);
            ((mym) mye.x()).a(feedbackOptions, bundle, j);
            a((icl) Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psbd failed!", e);
            c(mvd.a);
        }
    }
}
