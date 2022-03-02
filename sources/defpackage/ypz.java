package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;

/* renamed from: ypz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ypz extends AnimatorListenerAdapter {
    final /* synthetic */ yqb a;

    protected ypz(yqb yqb) {
        this.a = yqb;
    }

    public void onAnimationEnd(Animator animator) {
        yqb yqb = this.a;
        AudienceSelectionScrollView audienceSelectionScrollView = yqb.g;
        audienceSelectionScrollView.a = yqb;
        audienceSelectionScrollView.setVisibility(8);
        yqb.o = false;
    }
}
