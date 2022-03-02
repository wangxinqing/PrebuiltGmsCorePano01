package defpackage;

import android.accounts.Account;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* renamed from: ext  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ext extends qcg {
    public eze a;
    public fgr b;
    public View c;
    public ProgressBar d;
    private AccountParticleDisc e;
    private TextView f;
    private TextView g;
    private View h;
    private Button i;
    private Button j;

    public final void a() {
        this.j.setEnabled(false);
        this.i.setEnabled(false);
        this.a.a(true);
    }

    public final void onActivityCreated(Bundle bundle) {
        ezg ezg;
        SpannableStringBuilder spannableStringBuilder;
        super.onActivityCreated(bundle);
        eze eze = (eze) qck.a(getActivity()).a(eze.class);
        this.a = eze;
        eze.i.a(this, new exk(this));
        this.b = new fgr(this, this.a.d.c, (hol) null);
        View view = getView();
        ((ImageView) view.findViewById(R.id.app_icon)).setImageBitmap(this.a.f);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.credentials_google_sign_in_consent_title, this.a.e));
        this.e = (AccountParticleDisc) view.findViewById(R.id.account_particle_disc);
        qaq qaq = new qaq(new qvr(Looper.getMainLooper()));
        aoru a2 = jfm.a(9);
        agcf agcf = new agcf(qaq);
        this.e.a((agbv) agcf, eze.class);
        exs exs = new exs(this);
        AccountParticleDisc.a(getContext(), agcf, a2, exs, exs, eze.class);
        this.e.a((Object) this.a);
        ((TextView) view.findViewById(R.id.account_id)).setText(((Account) this.a.h.b()).name);
        this.f = (TextView) view.findViewById(R.id.consent);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        this.f.setMovementMethod(new LinkMovementMethod());
        String string = getString(R.string.common_privacy_policy_composed_string);
        String string2 = getString(R.string.common_terms_of_service_composed_string);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        Context context = getContext();
        ezg ezg2 = this.a.m;
        if (ezg2.b.a()) {
            Context context2 = context;
            SpannableStringBuilder spannableStringBuilder5 = spannableStringBuilder3;
            ezg = ezg2;
            qcn.a(context2, spannableStringBuilder5, string, (String) ezg2.b.b(), context.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new exo(this));
        } else {
            ezg = ezg2;
            spannableStringBuilder3.append(string);
        }
        if (ezg.a.a()) {
            Context context3 = context;
            SpannableStringBuilder spannableStringBuilder6 = spannableStringBuilder4;
            String str = string2;
            spannableStringBuilder = spannableStringBuilder4;
            qcn.a(context3, spannableStringBuilder6, str, (String) ezg.a.b(), context.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new exp(this));
        } else {
            spannableStringBuilder = spannableStringBuilder4;
            spannableStringBuilder.append(string2);
        }
        spannableStringBuilder2.append(TextUtils.expandTemplate(getString(R.string.credentials_assisted_signin_consent), new CharSequence[]{this.a.e, spannableStringBuilder3, spannableStringBuilder}));
        this.f.setText(spannableStringBuilder2);
        this.g = (TextView) view.findViewById(R.id.description);
        String string3 = getString(R.string.common_asm_google_account_title);
        this.g.setMovementMethod(new LinkMovementMethod());
        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
        SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
        Context context4 = getContext();
        qcn.a(context4, spannableStringBuilder7, string3, new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(getContext().getPackageName()).putExtra("extra.screenId", getResources().getInteger(R.integer.screen_id_sign_in_with_google_apps)).putExtra("extra.accountName", ((Account) this.a.h.b()).name).toUri(1), context4.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new exq(this));
        spannableStringBuilder8.append(TextUtils.expandTemplate(getString(R.string.credentials_assisted_signin_description), new CharSequence[]{spannableStringBuilder7}));
        this.g.setText(spannableStringBuilder8);
        this.g.setVisibility(0);
        this.h = view.findViewById(R.id.consent_gradient_bottom_rectangle);
        View findViewById = view.findViewById(R.id.parent_scroll_view);
        View findViewById2 = view.findViewById(R.id.child_linear_view);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new exr(this, view, findViewById2, findViewById));
        findViewById.getViewTreeObserver().addOnScrollChangedListener(new exl(this, findViewById2, findViewById));
        Button button = (Button) view.findViewById(R.id.cancel_button);
        this.i = button;
        button.setOnClickListener(new exm(this));
        Button button2 = (Button) view.findViewById(R.id.agree_and_share_button);
        this.j = button2;
        button2.setOnClickListener(new exn(this));
        this.c = view.findViewById(R.id.container_overlay);
        this.d = (ProgressBar) view.findViewById(R.id.loading_progress);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.cloneInContext(new vt((Context) getActivity(), (int) R.style.CredentialsDialogTheme)).inflate(R.layout.credentials_google_sign_in_consent_fragment, viewGroup, false);
    }

    public final void a(boolean z) {
        if (!z) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
    }
}
