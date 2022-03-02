package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mxn implements View.OnClickListener {
    private final Activity a;

    public mxn(Activity activity) {
        this.a = activity;
    }

    public void onClick(View view) {
        ((FeedbackChimeraActivity) this.a).dismiss(view);
    }
}
