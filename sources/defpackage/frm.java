package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: frm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class frm implements amsv {
    private final CredentialsSettingsChimeraActivity a;
    private final Account b;

    public frm(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, Account account) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = account;
    }

    public final Object a() {
        return qbc.a(this.a.d.a((ihb) new euv(this.b)));
    }
}
