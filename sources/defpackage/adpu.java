package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: adpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpu extends adpo implements View.OnClickListener {
    private static final iwd b = adnt.i("TvSetupOtaLayoutFragment");
    private View c;

    private final int h(int i) {
        Context context = getContext();
        amrl.a((Object) context);
        return context.getResources().getDimensionPixelSize(i);
    }

    public final void a() {
        a((String) adke.a.a());
        b((String) adke.c.a());
        if (g() != null) {
            g().setVisibility(4);
        }
        if (f() != null) {
            f().setVisibility(4);
        }
        e(-1);
        if (d() != null) {
            d().setVisibility(8);
        }
        if (h() != null && h().getVisibility() == 0) {
            h().setEnabled(true);
        }
        if (j() != null && j().getVisibility() == 0) {
            j().setEnabled(true);
        }
    }

    public final TextView c() {
        return (TextView) this.c.findViewById(R.id.guidance_description);
    }

    public final TextView d() {
        return (TextView) this.c.findViewById(R.id.action_text);
    }

    public final ProgressBar e() {
        return (ProgressBar) this.c.findViewById(R.id.progressbar);
    }

    public final TextView f() {
        return (TextView) this.c.findViewById(R.id.size_text);
    }

    /* access modifiers changed from: protected */
    public final TextView g() {
        return (TextView) this.c.findViewById(R.id.status_text);
    }

    /* renamed from: i */
    public final AppCompatTextView b() {
        return (AppCompatTextView) this.c.findViewById(R.id.guidance_title);
    }

    public final View j() {
        return this.c.findViewById(R.id.secondary_button);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.primary_button) {
            this.a.a();
        } else if (view.getId() == R.id.secondary_button) {
            this.a.b();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b.a("onCreateView", new Object[0]);
        this.c = layoutInflater.inflate(R.layout.system_update_tv_setup_fragment, viewGroup, false);
        a();
        this.c.findViewById(R.id.primary_button).setOnClickListener(this);
        this.c.findViewById(R.id.secondary_button).setOnClickListener(this);
        return this.c;
    }

    public final void b(boolean z) {
        this.c.findViewById(R.id.action_text).setVisibility(!z ? 8 : 0);
    }

    public final void c(boolean z) {
        iwd iwd = b;
        StringBuilder sb = new StringBuilder(28);
        sb.append("setGuidedActionsShown: ");
        sb.append(z);
        iwd.a(sb.toString(), new Object[0]);
        View findViewById = this.c.findViewById(R.id.guidance_container);
        View findViewById2 = this.c.findViewById(R.id.guided_actions_container);
        ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (z) {
            c().setVisibility(8);
            e().setVisibility(8);
            g().setVisibility(8);
            f().setVisibility(8);
            layoutParams2.removeRule(14);
            layoutParams2.width = h(R.dimen.system_update_tv_setup_guidance_container_partial_screen_width);
            findViewById.setLayoutParams(layoutParams2);
            findViewById.setPaddingRelative(h(R.dimen.system_update_setup_main_padding_start), findViewById.getPaddingTop(), h(R.dimen.system_update_setup_main_padding_end), findViewById.getPaddingBottom());
            findViewById2.setVisibility(0);
            layoutParams.width = h(R.dimen.system_update_setup_title_container_width);
            b().setLayoutParams(layoutParams);
            this.c.findViewById(R.id.primary_button).requestFocus();
            return;
        }
        findViewById2.setVisibility(8);
        layoutParams2.addRule(14, -1);
        layoutParams2.width = h(R.dimen.system_update_tv_setup_guidance_container_fullscreen_width);
        findViewById.setLayoutParams(layoutParams2);
        findViewById.setPaddingRelative(0, findViewById.getPaddingTop(), 0, findViewById.getPaddingBottom());
        layoutParams.width = h(R.dimen.system_update_tv_setup_guidance_container_fullscreen_width);
        b().setLayoutParams(layoutParams);
    }

    public final void f(int i) {
        ((TextView) h()).setText(i);
        if (!amrk.a(getString(i))) {
            h().setContentDescription(getString(i));
        }
        h().setVisibility(0);
        h().setEnabled(true);
    }

    public final void g(int i) {
        ((TextView) j()).setText(i);
        if (!amrk.a(getString(i))) {
            j().setContentDescription(getString(i));
        }
        j().setVisibility(0);
        j().setEnabled(true);
    }

    public final View h() {
        return this.c.findViewById(R.id.primary_button);
    }

    public final void a(boolean z) {
        if (g() != null) {
            g().setAccessibilityLiveRegion(!z ? 0 : 2);
        }
    }
}
