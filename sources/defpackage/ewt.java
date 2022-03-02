package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: ewt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ewt implements ax {
    private final exb a;

    public ewt(exb exb) {
        this.a = exb;
    }

    public final void a(Object obj) {
        String str;
        exb exb = this.a;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) ((List) obj).get(0);
        boolean z = !TextUtils.isEmpty(internalSignInCredentialWrapper.g.f);
        if (z) {
            exb.d.setText(internalSignInCredentialWrapper.g.a);
            exb.e.setText(exb.getString(R.string.credentials_assisted_hidden_password));
            exb.e.setTypeface(Typeface.MONOSPACE);
        } else {
            exb.d.setText(internalSignInCredentialWrapper.g.b);
            exb.e.setText(internalSignInCredentialWrapper.f.name);
            exb.e.setTypeface(Typeface.SANS_SERIF);
        }
        Context context = exb.getContext();
        exb.f.a((Object) fcp.a(context, internalSignInCredentialWrapper, exb.b.m));
        String str2 = !TextUtils.isEmpty(internalSignInCredentialWrapper.g.c) ? internalSignInCredentialWrapper.g.c : internalSignInCredentialWrapper.g.b;
        if (TextUtils.isEmpty(str2)) {
            str = exb.getString(R.string.common_continue);
        } else {
            str = exb.getString(R.string.credentials_assisted_continue_as_user_button_label, str2);
        }
        if (!internalSignInCredentialWrapper.a()) {
            exb.h.setText(exb.getString(R.string.credentials_assisted_signin_or_create_account_title, exb.l));
            exb.a(internalSignInCredentialWrapper);
            ezg ezg = exb.b.q;
            amri amri = ezg.b;
            amri amri2 = ezg.a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            exb.j.setMovementMethod(new LinkMovementMethod());
            String string = exb.getString(R.string.common_privacy_policy_composed_string);
            String string2 = exb.getString(R.string.common_terms_of_service_composed_string);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            Context context2 = exb.getContext();
            if (amri.a()) {
                qcn.a(context2, spannableStringBuilder2, string, (String) amri.b(), context2.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new ewx(exb));
            } else {
                spannableStringBuilder2.append(string);
            }
            if (amri2.a()) {
                qcn.a(context2, spannableStringBuilder3, string2, (String) amri2.b(), context2.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new ewy(exb));
            } else {
                spannableStringBuilder3.append(string2);
            }
            spannableStringBuilder.append(TextUtils.expandTemplate(exb.getString(R.string.credentials_assisted_signin_consent), new CharSequence[]{exb.l, spannableStringBuilder2, spannableStringBuilder3}));
            exb.j.setText(spannableStringBuilder);
            exb.i.setVisibility(0);
            exb.j.setVisibility(0);
            exb.g.setText(str);
        } else if (z) {
            exb.h.setText(exb.getString(R.string.credentials_assisted_sign_in_password_title, exb.l));
            exb.i.setMovementMethod(new LinkMovementMethod());
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            qcn.a(context, spannableStringBuilder5, exb.getString(R.string.common_asm_google_account_title), exb.a(internalSignInCredentialWrapper, exb.getResources().getInteger(R.integer.screen_id_saved_passwords)), context.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, new ewu(exb));
            spannableStringBuilder4.append(TextUtils.expandTemplate(exb.getString(R.string.credentials_assisted_sign_in_password_description), new CharSequence[]{exb.l, spannableStringBuilder5}));
            exb.i.setText(spannableStringBuilder4);
            exb.i.setVisibility(0);
            exb.j.setVisibility(8);
            exb.g.setText(R.string.common_continue);
        } else {
            exb.h.setText(exb.getString(R.string.credentials_assisted_sign_back_title, exb.l));
            exb.a(internalSignInCredentialWrapper);
            exb.j.setVisibility(8);
            exb.g.setText(str);
        }
        exb.g.setOnClickListener(new ewv(exb));
        exb.k.getViewTreeObserver().addOnGlobalLayoutListener(new exa(exb));
    }
}
