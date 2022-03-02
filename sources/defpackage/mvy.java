package defpackage;

import android.content.Context;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: mvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mvy implements igp {
    private final FeedbackOptions a;
    private final long b;
    private final Context c;

    public mvy(FeedbackOptions feedbackOptions, long j, Context context) {
        this.a = feedbackOptions;
        this.b = j;
        this.c = context;
    }

    public final void a(Object obj, Object obj2) {
        FeedbackOptions feedbackOptions = this.a;
        long j = this.b;
        Context context = this.c;
        mye mye = (mye) obj;
        mwc mwc = new mwc(feedbackOptions);
        mwc.g = j;
        FeedbackOptions a2 = mwc.a();
        mum mum = a2.q;
        if (mum != null) {
            myo.a(context, mum, j);
        }
        myo.a(a2);
        mye.a(a2);
        ((mym) mye.x()).a(a2);
        ((acwd) obj2).a((Object) null);
    }
}
