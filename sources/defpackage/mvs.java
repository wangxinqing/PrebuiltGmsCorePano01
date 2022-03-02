package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mvs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class mvs implements Runnable {
    private final FeedbackChimeraActivity a;

    public mvs(FeedbackChimeraActivity feedbackChimeraActivity) {
        this.a = feedbackChimeraActivity;
    }

    public final void run() {
        FeedbackChimeraActivity feedbackChimeraActivity = this.a;
        try {
            feedbackChimeraActivity.m.a(feedbackChimeraActivity.n);
        } catch (RemoteException e) {
            Log.e("gf_FeedbackActivity", e.getMessage());
        }
    }
}
