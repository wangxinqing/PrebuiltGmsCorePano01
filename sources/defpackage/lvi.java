package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: lvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lvi extends Fragment {
    lts g;

    static final Spanned b(String str) {
        if (jkr.c()) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* access modifiers changed from: package-private */
    public final Spanned a(int i) {
        return b(getString(i));
    }

    public abstract anxx b();

    public abstract CharSequence c();

    public void d() {
        getActivity().onBackPressed();
    }

    public CharSequence e() {
        return null;
    }

    public void f() {
    }

    public CharSequence h() {
        return "";
    }

    public int i() {
        return 0;
    }

    public CharSequence j() {
        return null;
    }

    public CharSequence k() {
        return null;
    }

    public void l() {
    }

    /* access modifiers changed from: package-private */
    public final lwy m() {
        return ((lwx) getActivity()).a();
    }

    /* access modifiers changed from: package-private */
    public final boolean n() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("DrivingMode.ImmediateStart", false)) {
            return false;
        }
        return true;
    }

    public final boolean o() {
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getInt("DrivingMode.ClientTriggerReason", 0) != 2) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lww.a();
        this.g = lww.e(getContext());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.car_driving_mode_frx, viewGroup, false);
        a(inflate);
        Button button = (Button) inflate.findViewById(R.id.next_button);
        if (e() == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(e());
            button.setOnClickListener(new lve(this));
        }
        Button button2 = (Button) inflate.findViewById(R.id.back_button);
        if (j() == null) {
            button2.setVisibility(8);
        } else {
            button2.setVisibility(0);
            button2.setText(j());
            button2.setOnClickListener(new lvf(this));
        }
        Button button3 = (Button) inflate.findViewById(R.id.tertiary_button);
        if (k() == null) {
            button3.setVisibility(8);
        } else {
            button3.setVisibility(0);
            button3.setText(k());
            button3.setOnClickListener(new lvg(this));
        }
        ((TextView) inflate.findViewById(R.id.body)).setText(h());
        ((ImageView) inflate.findViewById(R.id.illustration)).setImageResource(i());
        return inflate;
    }

    public void onResume() {
        super.onResume();
        this.g.a(b(), anxw.SCREEN_VIEW);
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        this.g.a(b(), anxw.DRIVING_MODE_FRX_NEXT_BUTTON);
        f();
    }

    /* access modifiers changed from: package-private */
    public final void q() {
        this.g.a(b(), anxw.DRIVING_MODE_FRX_BACK_BUTTON);
        d();
    }

    public final void r() {
        lww.a();
        luu f = lww.f(getContext());
        f.k();
        f.a((lut) new lvh(this, f));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r6) {
        /*
            r5 = this;
            r0 = 2131429464(0x7f0b0858, float:1.8480601E38)
            android.view.View r6 = r6.findViewById(r0)
            com.android.setupwizardlib.GlifLayout r6 = (com.android.setupwizardlib.GlifLayout) r6
            r0 = 2131429605(0x7f0b08e5, float:1.8480887E38)
            android.view.View r0 = r6.c(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131165582(0x7f07018e, float:1.7945385E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.height = r1
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.width = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r0.setScaleType(r1)
            r0.requestLayout()
            android.content.Context r0 = r5.getContext()
            r1 = 2131231796(0x7f080434, float:1.8079683E38)
            android.graphics.drawable.Drawable r0 = defpackage.kf.a((android.content.Context) r0, (int) r1)
            android.content.Context r1 = r5.getContext()     // Catch:{ all -> 0x0094 }
            android.content.res.Resources$Theme r1 = r1.getTheme()     // Catch:{ all -> 0x0094 }
            r2 = 1
            int[] r2 = new int[r2]     // Catch:{ all -> 0x0094 }
            r3 = 16843829(0x1010435, float:2.3696576E-38)
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x0094 }
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)     // Catch:{ all -> 0x0094 }
            android.content.res.Resources r2 = r5.getResources()     // Catch:{ all -> 0x0092 }
            r3 = 17170446(0x106000e, float:2.4611952E-38)
            int r2 = r2.getColor(r3)     // Catch:{ all -> 0x0092 }
            int r2 = r1.getColor(r4, r2)     // Catch:{ all -> 0x0092 }
            if (r1 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r1.recycle()
        L_0x0066:
            r0.setTint(r2)
            java.lang.Class<bdz> r1 = defpackage.bdz.class
            bea r1 = r6.a((java.lang.Class) r1)
            bdz r1 = (defpackage.bdz) r1
            android.widget.ImageView r1 = r1.a()
            if (r1 == 0) goto L_0x0082
            r1.setImageDrawable(r0)
            if (r0 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r4 = 8
        L_0x007f:
            r1.setVisibility(r4)
        L_0x0082:
            java.lang.CharSequence r0 = r5.c()
            java.lang.Class<bdy> r1 = defpackage.bdy.class
            bea r6 = r6.a((java.lang.Class) r1)
            bdy r6 = (defpackage.bdy) r6
            r6.a(r0)
            return
        L_0x0092:
            r6 = move-exception
            goto L_0x0096
        L_0x0094:
            r6 = move-exception
            r1 = 0
        L_0x0096:
            if (r1 == 0) goto L_0x009b
            r1.recycle()
        L_0x009b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvi.a(android.view.View):void");
    }

    public final void a(String str) {
        Context context = getContext();
        lww.a();
        ltb c = lww.c(context);
        if (((c.a() && !c.c().isEmpty()) || (lvd.g() && lxh.a(str))) && !o()) {
            m().c(new lvd());
        } else if (!n() || "car_pref_key_driving_mode_behavior_dnd_preference".equals(str)) {
            m().c(new lwe());
        } else {
            r();
        }
    }
}
