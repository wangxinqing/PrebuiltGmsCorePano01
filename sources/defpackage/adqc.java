package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: adqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adqc implements View.OnClickListener {
    final /* synthetic */ adqd a;

    public adqc(adqd adqd) {
        this.a = adqd;
    }

    public void onClick(View view) {
        Activity activity = this.a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }
}
