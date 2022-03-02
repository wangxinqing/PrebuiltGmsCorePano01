package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: ogo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ogo extends Fragment {
    public ProgressBar a;
    public View b;
    public View c;
    public long d = -1;
    public boolean e;
    public boolean f;
    public boolean g;
    public nzj h;
    public final Handler i = new qvr(Looper.getMainLooper());
    public final Runnable j = new ogm(this);
    public final Runnable k = new ogl(this);

    public final void a() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
            if (this.b.getVisibility() == 0 && qb.g(this.b) != 0.0f) {
                if (this.a.getVisibility() != 0) {
                    this.b.setVisibility(8);
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, "alpha", new float[]{1.0f, 0.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.c, "alpha", new float[]{0.0f, 1.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration(500);
                animatorSet.addListener(new ogn(this));
                animatorSet.start();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.gh_content_loading_fragment, viewGroup, false);
        this.b = inflate.findViewById(R.id.scrim);
        this.a = (ProgressBar) inflate.findViewById(R.id.gh_progress_bar);
        return inflate;
    }
}
