package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: muz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class muz extends mvc {
    final /* synthetic */ FeedbackOptions a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public muz(icc icc, FeedbackOptions feedbackOptions) {
        super(icc);
        this.a = feedbackOptions;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(ibf ibf) {
        mye mye = (mye) ibf;
        FeedbackOptions feedbackOptions = this.a;
        myo.a(feedbackOptions);
        ((mym) mye.x()).b(new ErrorReport(feedbackOptions, mye.a.getCacheDir()));
        a((icl) Status.a);
    }
}
