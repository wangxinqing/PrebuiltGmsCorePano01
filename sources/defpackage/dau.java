package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.view.BottomNavMenuScrollView;

/* renamed from: dau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class dau extends des {
    public dfp a;
    public aqqa b;
    public View c;
    public CardView d;
    public BottomNavMenuScrollView e;
    public View f;
    public LinearLayout g;
    public aqsr h;
    public String i;
    public djk j;

    public final void a(dat dat) {
        dez.a(getView());
        this.e.smoothScrollTo(0, 0);
        this.c.animate().alpha(0.0f).start();
        new qvr(Looper.getMainLooper()).postDelayed(new dae(this, dat), 250);
    }

    public final void onAttach(Activity activity) {
        aqqe aqqe;
        aqqa aqqa;
        super.onAttach(activity);
        this.j = ((czx) activity).b().a();
        dfp a2 = ((die) getActivity()).c().a(dfo.a(csm.a(getArguments().getByteArray("bottomNavKey"))));
        this.a = a2;
        csl d2 = a2.c.d(((dfe) a2.a).a);
        if (d2.a.b == 7) {
            int i2 = getArguments().getInt("selectedTabKey");
            aqso aqso = d2.a;
            if (aqso.b == 7) {
                aqqe = (aqqe) aqso.c;
            } else {
                aqqe = aqqe.b;
            }
            aucx aucx = aqqe.a;
            if (i2 < aucx.size() && ((aqpz) aucx.get(i2)).b == 3) {
                aqpz aqpz = (aqpz) aucx.get(i2);
                if (aqpz.b == 3) {
                    aqqa = (aqqa) aqpz.c;
                } else {
                    aqqa = aqqa.b;
                }
                this.b = aqqa;
                this.i = ((aqpz) aucx.get(i2)).d;
                this.h = csm.a(getArguments().getByteArray("selectedViewKey"));
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.as_bottom_nav_menu_drawer, viewGroup, false);
        this.c = inflate.findViewById(R.id.menu_background);
        this.g = (LinearLayout) inflate.findViewById(R.id.menu_list);
        this.d = (CardView) inflate.findViewById(R.id.menu_card_background);
        this.e = (BottomNavMenuScrollView) inflate.findViewById(R.id.menu_card_scrollview);
        View findViewById = inflate.findViewById(R.id.menu_card_top_space);
        this.f = findViewById;
        findViewById.setOnClickListener(new dad(this));
        this.e.d = new dah(this);
        inflate.setFocusableInTouchMode(true);
        inflate.requestFocus();
        inflate.setOnKeyListener(new dai(this));
        dez.b(inflate);
        return inflate;
    }

    public final void onStart() {
        aqqd aqqd;
        boolean z;
        aqqd aqqd2;
        super.onStart();
        if (this.b == null) {
            a((dat) null);
            return;
        }
        this.d.setVisibility(4);
        this.g.removeAllViews();
        aucx aucx = this.b.a;
        int size = aucx.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            aqqb aqqb = (aqqb) aucx.get(i2);
            int i3 = aqqb.a;
            if (i3 == 2) {
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(que.a(getContext(), R.attr.asDivider, R.drawable.as_divider_light));
                qb.a(imageView, getResources().getDimensionPixelSize(R.dimen.as_bottom_drawer_icon_space), 0, 0, 0);
                this.g.addView(imageView);
            } else if (i3 == 1) {
                daj daj = new daj(this);
                if (aqqb.a != 1) {
                    aqqd = aqqd.e;
                } else {
                    aqqd = (aqqd) aqqb.b;
                }
                aqsr aqsr = aqqd.b;
                if (aqsr == null) {
                    aqsr = aqsr.d;
                }
                if (aqsr.b == this.h.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (aqqb.a == 1) {
                    aqqd2 = (aqqd) aqqb.b;
                } else {
                    aqqd2 = aqqd.e;
                }
                this.g.addView(new dav(aqqd2, this.g, z, daj, this.j).b());
            }
        }
        if (awgs.a.a().f()) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(que.a(getContext(), R.attr.asDivider, R.drawable.as_divider_light));
            qb.a(imageView2, getResources().getDimensionPixelSize(R.dimen.as_bottom_drawer_icon_space), 0, 0, 0);
            this.g.addView(imageView2);
            a(new dak(this), "[DEBUG] clear local cache");
            dfp dfp = this.a;
            dfp.getClass();
            a(new dal(dfp), "[DEBUG] clear dismissed prompt cards");
            int i4 = Build.VERSION.SDK_INT;
            dfp dfp2 = this.a;
            dfp2.getClass();
            a(new dam(dfp2), "[DEBUG] clear dismissed onboarding flows");
            if (awgy.e() && jkr.e()) {
                a(new dan(this), "[DEBUG] force toggle dark mode");
                a(new dao(this), "[DEBUG] clear dark mode override");
            }
        }
        if (getActivity().getResources().getConfiguration().orientation == 2) {
            z2 = true;
        }
        this.d.addOnLayoutChangeListener(new das(this, z2, (AccessibilityManager) getContext().getSystemService("accessibility")));
        this.c.setAlpha(0.0f);
        this.c.animate().alpha(0.6f).start();
    }

    /* access modifiers changed from: package-private */
    public final void a(dat dat, String str) {
        aucd o = aqqd.e.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqd aqqd = (aqqd) o.b;
        str.getClass();
        aqqd.a |= 2;
        aqqd.c = str;
        aqsr aqsr = csm.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqqd aqqd2 = (aqqd) o.b;
        aqsr.getClass();
        aqqd2.b = aqsr;
        aqqd2.a |= 1;
        LinearLayout linearLayout = this.g;
        linearLayout.addView(new dav((aqqd) o.i(), linearLayout, false, new dap(this, dat), this.j).b());
    }
}
