package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.material.button.MaterialButton;

/* renamed from: exb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class exb extends qcg {
    public fcq a;
    public eyf b;
    public View c;
    public TextView d;
    public TextView e;
    public AccountParticleDisc f;
    public MaterialButton g;
    public TextView h;
    public TextView i;
    public TextView j;
    public View k;
    public String l;
    public boolean m;
    public fgr n;
    private View o;
    private View p;

    public final String a(InternalSignInCredentialWrapper internalSignInCredentialWrapper, int i2) {
        return new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getContext().getPackageName()).putExtra("extra.screenId", i2).putExtra("extra.accountName", internalSignInCredentialWrapper.f.name).toUri(1);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.a = (fcq) qck.a(activity).a(fcq.class);
        eyf eyf = (eyf) qck.a(activity).a(eyf.class);
        this.b = eyf;
        this.l = eyf.e;
        eyf.i.a(this, new ewt(this));
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        aoru a2 = jfm.a(9);
        agcf agcf = new agcf(qaq);
        this.f.a((agbv) agcf, fcp.class);
        fct fct = new fct(this.b.d);
        AccountParticleDisc.a(getContext(), agcf, a2, fct, fct, fcp.class);
        this.n = new fgr(this, this.b.g, (hol) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.m = bundle.getBoolean("key_stop_user_interaction", false);
        }
        View inflate = layoutInflater.cloneInContext(new vt(getContext(), (int) R.style.AppBottomSheetDialogTheme)).inflate(R.layout.credentials_assisted_signin_single_entry, viewGroup, false);
        this.c = inflate.findViewById(R.id.header_with_logo);
        inflate.findViewById(R.id.cancel).setOnClickListener(new ewz(this));
        this.o = inflate.findViewById(R.id.divider);
        this.p = inflate.findViewById(R.id.progress);
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.f = (AccountParticleDisc) inflate.findViewById(R.id.account_particle_disc);
        this.d = (TextView) inflate.findViewById(R.id.account_display_name);
        this.e = (TextView) inflate.findViewById(R.id.account_name);
        this.g = (MaterialButton) inflate.findViewById(R.id.continue_button);
        this.j = (TextView) inflate.findViewById(R.id.consent);
        this.i = (TextView) inflate.findViewById(R.id.description);
        this.k = inflate.findViewById(R.id.main_container);
        if (this.m) {
            a();
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("key_stop_user_interaction", this.m);
        super.onSaveInstanceState(bundle);
    }

    public final void a() {
        this.m = true;
        this.g.setEnabled(false);
        this.o.setVisibility(8);
        this.p.setVisibility(0);
        this.k.setAlpha(0.3f);
    }

    public final void a(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        String string = getString(R.string.common_asm_google_account_title);
        this.i.setMovementMethod(new LinkMovementMethod());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        Context context = getContext();
        qcn.a(context, spannableStringBuilder, string, a(internalSignInCredentialWrapper, getResources().getInteger(R.integer.screen_id_sign_in_with_google_apps)), context.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new eww(this));
        spannableStringBuilder2.append(TextUtils.expandTemplate(getString(R.string.credentials_assisted_signin_description), new CharSequence[]{spannableStringBuilder}));
        this.i.setText(spannableStringBuilder2);
        this.i.setVisibility(0);
    }
}
