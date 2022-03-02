package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.yolo.ui.CredentialsSettingsChimeraActivity;

/* renamed from: fri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class fri implements amsv {
    private final CredentialsSettingsChimeraActivity a;
    private final boolean b;

    public fri(CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity, boolean z) {
        this.a = credentialsSettingsChimeraActivity;
        this.b = z;
    }

    public final Object a() {
        CredentialsSettingsChimeraActivity credentialsSettingsChimeraActivity = this.a;
        boolean z = this.b;
        Account account = credentialsSettingsChimeraActivity.h;
        iva.a((Object) account);
        return qbc.a(credentialsSettingsChimeraActivity.d.b((ihb) new eux(account, z)));
    }
}
