package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.R;

/* renamed from: gs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gs {
    static gq a(Context context, gj gjVar, boolean z) {
        int i;
        gg ggVar = gjVar.V;
        int i2 = ggVar != null ? ggVar.d : 0;
        int e = gjVar.e();
        gjVar.a(0);
        ViewGroup viewGroup = gjVar.R;
        if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            gjVar.R.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup2 = gjVar.R;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = gjVar.onCreateAnimation(i2, z, e);
        if (onCreateAnimation != null) {
            return new gq(onCreateAnimation);
        }
        Animator onCreateAnimator = gjVar.onCreateAnimator(i2, z, e);
        if (onCreateAnimator != null) {
            return new gq(onCreateAnimator);
        }
        if (e != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(e));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, e);
                    if (loadAnimation != null) {
                        return new gq(loadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, e);
                if (loadAnimator != null) {
                    return new gq(loadAnimator);
                }
            } catch (RuntimeException e4) {
                if (!equals) {
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, e);
                    if (loadAnimation2 != null) {
                        return new gq(loadAnimation2);
                    }
                } else {
                    throw e4;
                }
            }
        }
        if (i2 != 0) {
            if (i2 != 4097) {
                i = i2 != 4099 ? i2 != 8194 ? -1 : z ? R.anim.fragment_close_enter : R.anim.fragment_close_exit : z ? R.anim.fragment_fade_enter : R.anim.fragment_fade_exit;
            } else {
                i = z ? R.anim.fragment_open_enter : R.anim.fragment_open_exit;
            }
            if (i >= 0) {
                return new gq(AnimationUtils.loadAnimation(context, i));
            }
        }
        return null;
    }
}
