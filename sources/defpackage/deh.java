package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.view.animation.AnimationUtils;
import com.google.android.gms.R;

/* renamed from: deh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class deh implements ax {
    private final deo a;

    public deh(deo deo) {
        this.a = deo;
    }

    public final void a(Object obj) {
        deo deo = this.a;
        dia dia = (dia) obj;
        if (dia == dia.BRANDING) {
            den den = deo.d;
            den.b();
            den.c.b.setVisibility(0);
            den.a = AnimationUtils.loadAnimation(den.c.getContext(), R.anim.as_splash_screen_branding_anim);
            den.a.setAnimationListener(new dei(den));
            den.c.b.startAnimation(den.a);
        } else if (dia == dia.LOADING_SPINNER) {
            den den2 = deo.d;
            den2.a();
            den2.c.a.d();
            den2.c.b.setVisibility(8);
            den2.c.a.setVisibility(0);
            den2.c.a.a(0, 135);
            den2.c.a.a(false);
            den2.a((AnimatorListenerAdapter) new dej(den2));
            den2.c.a.b();
        } else if (dia == dia.FINISHING_WITHOUT_ONBOARDING) {
            Resources resources = deo.getContext().getResources();
            deo.d.a((float) resources.getDimensionPixelSize(R.dimen.as_expanded_avatar_size), (float) resources.getDimensionPixelSize(R.dimen.as_appbar_expanded_avatar_top_margin));
        } else if (dia == dia.FINISHING_WITH_ONBOARDING) {
            Resources resources2 = deo.getContext().getResources();
            deo.d.a((float) resources2.getDimensionPixelSize(R.dimen.as_ob_avatar_size), (float) resources2.getDimensionPixelSize(R.dimen.as_ob_avatar_margin_top));
        }
    }
}
