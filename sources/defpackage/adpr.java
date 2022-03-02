package defpackage;

import android.view.View;
import com.google.android.chimera.Activity;

/* renamed from: adpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class adpr implements View.OnClickListener {
    final /* synthetic */ adps a;

    public adpr(adps adps) {
        this.a = adps;
    }

    public void onClick(View view) {
        Activity activity = this.a.getActivity();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }
}
