package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.tabs.TabLayout;

/* renamed from: ddf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ddf extends des {
    public dhn a;
    public aqrx b;
    public ddd c;
    public AccessibilityManager d;
    public AccountParticleDisc e;
    public ViewPager f;
    public LottieAnimationView g;
    public int h;
    public boolean i;
    public cxv j;

    public final String a(int i2) {
        String str = ((aqry) this.b.c.get(i2)).a;
        String str2 = ((aqry) this.b.c.get(i2)).b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("\n");
        sb.append(str2);
        return sb.toString();
    }

    public final int b(int i2) {
        return cyd.a(getContext()) ? (this.b.c.size() - i2) - 1 : i2;
    }

    public final void onActivityCreated(Bundle bundle) {
        int i2;
        super.onActivityCreated(bundle);
        View view = getView();
        csh c2 = this.a.a.c();
        if (c2.c == 3) {
            agcf a2 = ((cxx) getActivity()).a();
            this.e = (AccountParticleDisc) view.findViewById(R.id.avatar_disc);
            cxv cxv = new cxv(this.e, a2);
            this.j = cxv;
            dfd dfd = this.a.b;
            cxv.a((amri) dfd.b.a(dfd.b()).b());
            this.a.b.d.a(this, new dcx(this));
            this.e.setVisibility(0);
            this.g = (LottieAnimationView) view.findViewById(R.id.lottie_onboarding_animation);
            this.f = (ViewPager) view.findViewById(R.id.onboarding_view_pager);
            this.h = this.a.a.d().b;
            this.b = c2.a;
            dde dde = new dde(this, getContext());
            this.f.a((atr) dde);
            dhn dhn = this.a;
            int i3 = this.h;
            int i4 = ((aqry) this.b.c.get(0)).e;
            dhn.e = i4;
            dhn.d.a(0, i3, 0, i4);
            this.c = new ddd(this, c2.b);
            this.i = false;
            dcz dcz = new dcz(this);
            ddd ddd = this.c;
            aqpw aqpw = ((aqry) this.b.c.get(0)).c;
            if (aqpw == null) {
                aqpw = aqpw.c;
            }
            ddd.a(aqpw, dcz);
            this.d = (AccessibilityManager) getContext().getSystemService("accessibility");
            this.f.a((aua) new dda(this, dcz));
            if (cyd.a(getContext())) {
                this.f.b(dde.a() - 1);
            }
            if (awgy.b() && this.d.isTouchExplorationEnabled()) {
                this.f.setContentDescription(a(0));
                this.f.requestFocus();
                this.f.sendAccessibilityEvent(8);
            }
            if (this.b.c.size() > 1) {
                TabLayout tabLayout = (TabLayout) view.findViewById(R.id.page_indicator);
                tabLayout.a(this.f);
                tabLayout.setVisibility(0);
                if (awgy.b() && this.d.isTouchExplorationEnabled()) {
                    for (int i5 = 0; i5 < tabLayout.b(); i5++) {
                        if (cyd.a(getContext())) {
                            i2 = (tabLayout.b() - i5) - 1;
                        } else {
                            i2 = i5;
                        }
                        tabLayout.a(i5).a((CharSequence) getResources().getString(R.string.as_warm_welcome_tab_indicator_button_a11y_description, new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(tabLayout.b()), ((aqry) this.b.c.get(i2)).a}));
                    }
                }
                qb.d(tabLayout, 0);
            }
            Button button = (Button) view.findViewById(R.id.skip_button);
            button.setOnClickListener(new dcy(this, button));
            button.setText(this.b.e);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        dhn dhn = ((die) activity).c().g;
        this.a = dhn;
        dhn.c.e.a(this, new dcw(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.as_onboarding_flow_fragment, viewGroup, false);
    }
}
