package defpackage;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class frn implements View.OnClickListener {
    private final CredentialsSettingsChimeraActivity a;
    private final String b;

    public frn(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = str;
    }

    public void onClick(View view) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        String str = this.b;
        oq a2 = credentialsSettingsChimeraActivity.a(str);
        CharSequence charSequence = (CharSequence) a2.a;
        Drawable drawable = (Drawable) a2.b;
        Spanned fromHtml = Html.fromHtml(String.format(credentialsSettingsChimeraActivity.getResources().getString(R.string.credentials_pref_never_save_remove_ask), new Object[]{charSequence}));
        Account account = credentialsSettingsChimeraActivity.h;
        iva.a((Object) account);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(credentialsSettingsChimeraActivity).setMessage(fromHtml).setPositiveButton(17039370, new frg(credentialsSettingsChimeraActivity, str, account)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
        if (drawable != null) {
            negativeButton.setIcon(drawable);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            negativeButton.setTitle(charSequence);
        }
        negativeButton.show();
        fgm.a().a(CredentialsSettingsChimeraActivity.a(506));
    }
}
