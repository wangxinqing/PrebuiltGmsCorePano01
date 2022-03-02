package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abkg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abkg implements View.OnClickListener {
    public final boolean a;
    public abka b;
    public final int c;
    private final BaseCardView d;
    private final boolean e;
    private final jtf f;
    private View g;

    public abkg(BaseCardView baseCardView, abkc abkc, abka abka, boolean z, boolean z2, int i, int i2, jtf jtf) {
        this.d = baseCardView;
        this.e = z2;
        this.c = i2;
        boolean z3 = baseCardView.getResources().getBoolean(R.bool.is_tablet);
        this.a = z3;
        this.f = jtf;
        i = z3 ? (i + 1) / 2 : i;
        if (abkc != null) {
            ((ViewGroup) baseCardView.findViewById(R.id.card_content)).addView(abkc.c);
        }
        if (abka != null) {
            ((ViewGroup) baseCardView.findViewById(R.id.card_content)).addView(abka.c);
            this.b = abka;
        }
        if (z2) {
            ViewGroup viewGroup = (ViewGroup) baseCardView.findViewById(R.id.card_content);
            View inflate = LayoutInflater.from(baseCardView.getContext()).inflate(R.layout.reporting_chain_warning, (ViewGroup) null);
            this.g = inflate;
            ry.a((TextView) inflate.findViewById(R.id.warning_message), jpr.a(uj.b(baseCardView.getContext(), R.drawable.quantum_ic_error_vd_theme_24), kf.b(baseCardView.getContext(), R.color.card_entry_light_text_color)), (Drawable) null);
            viewGroup.addView(this.g, viewGroup.getChildCount());
        }
        if (z && abka != null) {
            abka.b();
            if (i > 3) {
                abka.a(i);
                b();
                return;
            }
            a();
        }
    }

    private final void a() {
        View view;
        c();
        if (this.e && (view = this.g) != null) {
            view.setVisibility(8);
        }
    }

    private final void b() {
        View view;
        c();
        if (!this.b.d() && this.e && (view = this.g) != null) {
            view.setVisibility(0);
        }
    }

    private final void c() {
        String str;
        if (this.b.d()) {
            BaseCardView baseCardView = this.d;
            if (this.b.a.size() - this.b.b >= this.d.getContext().getResources().getInteger(R.integer.reporting_chain_max_num_rows_to_expand_at_once)) {
                str = this.d.getContext().getString(R.string.reporting_chain_see_more, new Object[]{20});
            } else {
                str = this.d.getContext().getString(R.string.reporting_chain_see_all, new Object[]{Integer.valueOf(this.c)});
            }
            baseCardView.a(str, (int) R.drawable.quantum_ic_expand_more_vd_theme_24, (View.OnClickListener) this);
            return;
        }
        this.d.b(R.string.profile_see_less, R.drawable.quantum_ic_expand_less_vd_theme_24, this);
    }

    public void onClick(View view) {
        if (this.b.d()) {
            this.f.a(jth.SEE_MORE_BUTTON, jth.REPORTING_CHAIN_CARD);
            this.b.a();
            b();
            return;
        }
        this.f.a(jth.SEE_LESS_BUTTON, jth.REPORTING_CHAIN_CARD);
        this.b.b();
        a();
    }
}
