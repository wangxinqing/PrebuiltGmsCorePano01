package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: ffp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffp extends qcg {
    public fez a;
    public fcq b;
    public View c;
    public LinearLayout d;
    public View e;
    public AccountParticleDisc f;
    public TextView g;
    public TextView h;
    public ImageView i;
    private TextView j;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.a = (fez) qck.a(activity).a(fez.class);
        this.b = (fcq) qck.a(activity).a(fcq.class);
        this.a.j.a(this, new ffm(this));
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        aoru a2 = jfm.a(9);
        agcf agcf = new agcf(qaq);
        this.f.a((agbv) agcf, fcp.class);
        fct fct = new fct(this.a.c);
        AccountParticleDisc.a(getContext(), agcf, a2, fct, fct, fcp.class);
        String string = getString(R.string.common_asm_google_account_title);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        fez fez = this.a;
        SignInPassword signInPassword = fez.d.a;
        String str = signInPassword.a;
        fcp a3 = fcp.a(str, str, signInPassword.b, (String) null);
        a3.e = (Bitmap) fez.f.b;
        this.j.setText(a3.b);
        this.a.m.a(this, new ffn(this, getContext(), spannableStringBuilder, string, spannableStringBuilder2));
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(new ffo(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new vt(getContext(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_gis_password_saving_confirmation, viewGroup, false);
        this.c = inflate.findViewById(R.id.confirmation_container);
        ((TextView) inflate.findViewById(R.id.title_text)).setText(R.string.credentials_gis_pw_saving_save_password);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.selected_google_account);
        this.d = linearLayout;
        linearLayout.setOnClickListener(new ffj(this));
        inflate.findViewById(R.id.no_thanks_button).setOnClickListener(new ffk(this));
        inflate.findViewById(R.id.save_button).setOnClickListener(new ffl(this));
        this.e = inflate.findViewById(R.id.down_arrow);
        this.f = (AccountParticleDisc) inflate.findViewById(R.id.google_profile_img);
        this.g = (TextView) inflate.findViewById(R.id.google_account_email);
        this.h = (TextView) inflate.findViewById(R.id.consent_text);
        this.i = (ImageView) inflate.findViewById(R.id.account_app_image);
        this.j = (TextView) inflate.findViewById(R.id.username_text);
        return inflate;
    }
}
