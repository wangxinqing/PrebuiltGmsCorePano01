package defpackage;

import android.accounts.Account;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vps implements View.OnClickListener {
    private final SettingsChimeraActivity a;
    private final Account b;

    public vps(SettingsChimeraActivity settingsChimeraActivity, Account account) {
        this.a = settingsChimeraActivity;
        this.b = account;
    }

    public void onClick(View view) {
        who.a(this.b, (Activity) this.a);
    }
}
