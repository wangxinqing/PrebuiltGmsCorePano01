package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: fre  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class fre implements amsv {
    private final CredentialsSettingsChimeraActivity a;
    private final Account b;
    private final amri c;

    public fre(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, Account account, amri amri) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = account;
        this.c = amri;
    }

    public final Object a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        return qbc.a(credentialsSettingsChimeraActivity.d.a(this.b, (String) this.c.b(), false));
    }
}
