package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.pano.widget.FrameLayoutWithShadows;

/* renamed from: akev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akev extends AnimatorListenerAdapter {
    final /* synthetic */ akey a;

    public akev(akey akey) {
        this.a = akey;
    }

    public final void onAnimationEnd(Animator animator) {
        akey akey = this.a;
        int i = akey.k;
        int size = akey.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            akfa akfa = (akfa) this.a.e.get(i2);
            akex akex = this.a.f;
            if (akex != null) {
                aker aker = akfa.a;
                ImageView imageView = akex.a;
                if (imageView != null) {
                    if (imageView.getVisibility() != 0) {
                        akex.a.setImageDrawable(aker.b);
                        int intrinsicWidth = akex.a.getDrawable().getIntrinsicWidth();
                        ViewGroup.LayoutParams layoutParams = akex.a.getLayoutParams();
                        layoutParams.height = (layoutParams.width * akex.a.getDrawable().getIntrinsicHeight()) / intrinsicWidth;
                        akex.a.setVisibility(0);
                    }
                    akex.a.setAlpha(1.0f);
                }
                FrameLayoutWithShadows frameLayoutWithShadows = akex.b.c;
                if (frameLayoutWithShadows != null) {
                    frameLayoutWithShadows.a(1.0f);
                }
            }
            this.a.b.removeView(akfa);
        }
        this.a.e.clear();
        akey akey2 = this.a;
        akey2.h = 4;
        akex akex2 = akey2.f;
    }
}
