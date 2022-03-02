package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.feedback.FeedbackChimeraActivity;

/* renamed from: mxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class mxo implements View.OnClickListener {
    private final Activity a;

    public mxo(Activity activity) {
        this.a = activity;
    }

    public void onClick(View view) {
        ((FeedbackChimeraActivity) this.a).readMore(view);
    }
}
