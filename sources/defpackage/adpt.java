package defpackage;

import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;

/* renamed from: adpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adpt extends adpo implements View.OnClickListener {
    private static final iwd b = adnt.i("TvSettingsOtaLayoutFragment");
    private View c;

    public final void a() {
        a((int) R.string.checking_for_update_status_text);
        c().setVisibility(4);
        e(-1);
        if (d() != null) {
            d().setVisibility(4);
        }
        if (f() != null) {
            f().setVisibility(4);
        }
        if (g() != null) {
            g().setVisibility(4);
        }
    }

    public final /* bridge */ /* synthetic */ TextView b() {
        return (AppCompatTextView) this.c.findViewById(R.id.guidance_title);
    }

    public final TextView c() {
        return (TextView) this.c.findViewById(R.id.guidance_description);
    }

    public final void c(boolean z) {
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

    public final void g(int i) {
    }

    public final View h() {
        return this.c.findViewById(R.id.action_button);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.action_button) {
            this.a.a();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b.a("onCreateView", new Object[0]);
        this.c = layoutInflater.inflate(R.layout.system_update_tv_settings_fragment, viewGroup, false);
        a();
        f(R.string.system_update_check_now_button_text);
        h().setEnabled(false);
        this.c.findViewById(R.id.action_button).setOnClickListener(this);
        return this.c;
    }

    public final void f(int i) {
        ((Button) h()).setText(i);
        if (!amrk.a(getString(i))) {
            h().setContentDescription(getString(i));
        }
        h().setVisibility(0);
        h().setEnabled(true);
    }

    public final void b(boolean z) {
        this.c.findViewById(R.id.action_text).setVisibility(!z ? 4 : 0);
    }
}
