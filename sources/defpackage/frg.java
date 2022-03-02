package defpackage;

import android.accounts.Account;
import android.content.DialogInterface;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class frg implements DialogInterface.OnClickListener {
    private final CredentialsSettingsChimeraActivity a;
    private final String b;
    private final Account c;

    public frg(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, String str, Account account) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = str;
        this.c = account;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        String str = this.b;
        Account account = this.c;
        amri a2 = hiq.a(credentialsSettingsChimeraActivity, str);
        if (a2.a()) {
            credentialsSettingsChimeraActivity.a(5, new fre(credentialsSettingsChimeraActivity, account, a2), credentialsSettingsChimeraActivity.getString(R.string.credentials_pref_failed_remove_never_save));
        }
    }
}
