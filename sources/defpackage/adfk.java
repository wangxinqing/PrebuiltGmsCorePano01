package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;

/* renamed from: adfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adfk {
    private static final jjg b = jjg.a();
    public final ViewGroup a;
    private final LayoutInflater c;

    public adfk(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c = layoutInflater;
        this.a = viewGroup;
    }

    public final View a(int i) {
        View inflate = this.c.inflate(i, this.a, false);
        if (inflate != null) {
            this.a.addView(inflate);
        } else {
            anih anih = (anih) b.b();
            anih.a(anig.MEDIUM);
            ((anih) anih.a("adfk", "a", 40, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Layout was not inflated");
        }
        return inflate;
    }

    public final void a() {
        a(R.layout.udc_consent_spacer);
    }
}
