package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvl implements myb {
    private final FeedbackOptions a;

    public mvl(FeedbackOptions feedbackOptions) {
        this.a = feedbackOptions;
    }

    public final void a(Object obj) {
        FeedbackAsyncChimeraService.b((Context) obj, this.a);
    }
}
