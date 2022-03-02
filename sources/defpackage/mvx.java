package defpackage;

import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mvx implements Runnable {
    final /* synthetic */ mwg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ FeedbackChimeraActivity c;

    public mvx(FeedbackChimeraActivity feedbackChimeraActivity, mwg mwg, boolean z) {
        this.c = feedbackChimeraActivity;
        this.a = mwg;
        this.b = z;
    }

    public final void run() {
        this.c.a(this.a, this.b);
    }
}
