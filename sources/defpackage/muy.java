package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: muy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class muy extends mvc {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ Context b;
    final /* synthetic */ long c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public muy(icc icc, FeedbackOptions feedbackOptions, Context context, long j) {
        super(icc);
        this.a = feedbackOptions;
        this.b = context;
        this.c = j;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        mum mum;
        mye mye = (mye) ibf;
        FeedbackOptions feedbackOptions = this.a;
        if (feedbackOptions == null || (mum = feedbackOptions.q) == null) {
            myo.a(feedbackOptions);
            mye.a(feedbackOptions);
            ((mym) mye.x()).a(new ErrorReport(feedbackOptions, mye.a.getCacheDir()));
            a((icl) Status.a);
            return;
        }
        myo.a(this.b, mum, this.c);
        FeedbackOptions feedbackOptions2 = this.a;
        long j = this.c;
        myo.a(feedbackOptions2);
        mye.a(feedbackOptions2);
        ((mym) mye.x()).a(new ErrorReport(feedbackOptions2, mye.a.getCacheDir()), j);
        a((icl) Status.a);
    }
}
