package defpackage;

import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: xrd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xrd implements Runnable {
    final /* synthetic */ FeedbackOptions a;
    final /* synthetic */ xre b;

    public xrd(xre xre, FeedbackOptions feedbackOptions) {
        this.b = xre;
        this.a = feedbackOptions;
    }

    public final void run() {
        mvd.a(this.b.e.b, this.a);
    }
}
