package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvo implements myb {
    private final FeedbackOptions a;

    public mvo(FeedbackOptions feedbackOptions) {
        this.a = feedbackOptions;
    }

    public final void a(Object obj) {
        FeedbackAsyncChimeraService.a((Context) obj, this.a);
    }
}
