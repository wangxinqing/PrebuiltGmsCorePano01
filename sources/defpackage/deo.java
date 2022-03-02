package defpackage;

import android.animation.Animator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: deo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class deo extends des {
    LottieAnimationView a;
    ProductLockupView b;
    dib c;
    public den d;
    AccountParticleDisc e;
    private cxv f;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = (LottieAnimationView) getView().findViewById(R.id.lottie_loading_animation);
        ProductLockupView productLockupView = (ProductLockupView) getView().findViewById(R.id.product_lockup);
        this.b = productLockupView;
        productLockupView.d = uj.b(productLockupView.getContext(), R.drawable.googlelogo_standard_color_vd_112x36);
        productLockupView.a();
        ProductLockupView productLockupView2 = this.b;
        productLockupView2.f = new aeoh(getContext().getResources(), R.dimen.product_name_text_size_asm, R.dimen.logo_margin_top_asm, R.dimen.logo_width_asm, R.dimen.logo_height_asm, R.dimen.separation_margin_asm);
        productLockupView2.g = new int[]{-1, 1, 2};
        productLockupView2.e = -1;
        productLockupView2.requestLayout();
        if (qud.h()) {
            this.b.b(2);
            ProductLockupView productLockupView3 = this.b;
            productLockupView3.b.setTextColor(kf.b(productLockupView3.getContext(), R.color.google_white));
        }
        this.e = (AccountParticleDisc) getView().findViewById(R.id.avatar_disc);
        this.f = new cxv(this.e, ((cxx) getActivity()).a());
        as asVar = this.c.a.d;
        cxv cxv = this.f;
        cxv.getClass();
        asVar.a(this, new deg(cxv));
        this.d = new den(this);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dib dib = ((die) activity).c().f;
        this.c = dib;
        dib.c.e.a(this, new def(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.as_splash_screen_fragment, viewGroup, false);
    }

    public final void onPause() {
        this.c.d.a((aj) this);
        den den = this.d;
        den.a();
        den.b();
        ViewPropertyAnimator viewPropertyAnimator = den.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
            den.b.cancel();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.c.d.a(this, new deh(this));
    }
}
