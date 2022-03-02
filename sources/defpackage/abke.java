package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import com.google.android.gms.smart_profile.card.view.BaseCardView;

/* renamed from: abke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abke implements View.OnClickListener {
    public final BaseCardView a;
    public boolean b;
    public abkc c;
    private final abkd d;

    public abke(BaseCardView baseCardView, abkc abkc, abkd abkd, boolean z, boolean z2) {
        this.a = baseCardView;
        this.c = abkc;
        this.d = abkd;
        ((ViewGroup) baseCardView.findViewById(R.id.card_content)).addView(abkc.c);
        a(z, z2);
    }

    private final void b() {
        this.b = false;
        this.a.b(R.string.profile_see_more, R.drawable.quantum_ic_expand_more_vd_theme_24, this);
        this.c.b();
    }

    public final void a() {
        this.b = true;
        this.a.b(R.string.profile_see_less, R.drawable.quantum_ic_expand_less_vd_theme_24, this);
        this.c.a();
    }

    public void onClick(View view) {
        if (this.b) {
            this.d.b();
            b();
            return;
        }
        this.d.a();
        a();
    }

    public final void a(boolean z, boolean z2) {
        if (!z) {
            return;
        }
        if (!z2) {
            b();
        } else {
            a();
        }
    }
}
