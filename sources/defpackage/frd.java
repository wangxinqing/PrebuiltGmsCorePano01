package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class frd implements amsv {
    private final CredentialsSettingsChimeraActivity a;
    private final amri b;

    public frd(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, amri amri) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = amri;
    }

    public final Object a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        amri amri = this.b;
        Account account = credentialsSettingsChimeraActivity.h;
        iva.a((Object) account);
        return qbc.a(credentialsSettingsChimeraActivity.d.a(account, (String) amri.b(), true));
    }
}
