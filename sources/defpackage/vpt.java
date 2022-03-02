package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: vpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vpt implements acvv {
    private final SettingsChimeraActivity a;
    private final Account b;

    public vpt(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.a = settingsChimeraActivity;
        this.b = account;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        Account account = this.b;
        String a2 = ((whn) obj).a();
        settingsChimeraActivity.d.setText(a2);
        GoogleAccountAvatar googleAccountAvatar = settingsChimeraActivity.f;
        agbk g = agbl.g();
        g.a(account.name);
        g.a = a2;
        googleAccountAvatar.a((Object) g.a());
    }
}
