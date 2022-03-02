package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.R;

/* renamed from: yqk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class yqk implements View.OnClickListener {
    final /* synthetic */ yqq a;
    private final boolean b;

    public yqk(yqq yqq, boolean z) {
        this.a = yqq;
        this.b = z;
    }

    public void onClick(View view) {
        String str;
        yqq yqq = this.a;
        if (this.b) {
            str = yqq.c.getText().toString();
        } else {
            str = null;
        }
        yqq.getActivity().overridePendingTransition(0, 0);
        Animation loadAnimation = AnimationUtils.loadAnimation(yqq.getActivity().getApplicationContext(), R.anim.circle_creation_dialog_slide_down);
        loadAnimation.setAnimationListener(new yqm(yqq, str));
        yqq.a.startAnimation(loadAnimation);
    }
}
