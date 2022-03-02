package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mvq implements myb {
    private final mvr a;
    private final long b;
    private final FeedbackOptions c;
    private final Bundle d;

    public mvq(mvr mvr, long j, FeedbackOptions feedbackOptions, Bundle bundle) {
        this.a = mvr;
        this.b = j;
        this.c = feedbackOptions;
        this.d = bundle;
    }

    public final void a(Object obj) {
        Context context = (Context) obj;
        ofx.a(this.b, this.c, this.d, context, this.a.a());
    }
}
