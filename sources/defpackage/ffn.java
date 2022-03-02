package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.google.android.gms.R;

/* renamed from: ffn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ffn implements ax {
    private final ffp a;
    private final Context b;
    private final SpannableStringBuilder c;
    private final String d;
    private final SpannableStringBuilder e;

    public ffn(ffp ffp, Context context, SpannableStringBuilder spannableStringBuilder, String str, SpannableStringBuilder spannableStringBuilder2) {
        this.a = ffp;
        this.b = context;
        this.c = spannableStringBuilder;
        this.d = str;
        this.e = spannableStringBuilder2;
    }

    public final void a(Object obj) {
        ffp ffp = this.a;
        Context context = this.b;
        SpannableStringBuilder spannableStringBuilder = this.c;
        String str = this.d;
        SpannableStringBuilder spannableStringBuilder2 = this.e;
        fcp fcp = (fcp) obj;
        qcn.a(context, spannableStringBuilder, str, new Intent("com.google.android.gms.accountsettings.VIEW_SETTINGS_0P").setPackage(ffp.getContext().getPackageName()).putExtra("extra.screenId", ffp.getResources().getInteger(R.integer.screen_id_saved_passwords)).putExtra("extra.accountName", ((Account) ffp.a.n.get(fcp)).name).toUri(1), context.getTheme(), R.style.AppBottomSheetDialogTheme, R.attr.credential_assisted_link_color, (View.OnClickListener) null);
        spannableStringBuilder2.append(TextUtils.expandTemplate(ffp.getString(R.string.credentials_gis_pw_saving_consent_text), new CharSequence[]{ffp.a.c(), spannableStringBuilder}));
        ffp.h.setMovementMethod(new LinkMovementMethod());
        ffp.h.setText(spannableStringBuilder2);
        ffp.f.a((Object) fcp);
        ffp.g.setText(fcp.b);
        ffp.i.setImageBitmap((Bitmap) ffp.a.f.b);
    }
}
