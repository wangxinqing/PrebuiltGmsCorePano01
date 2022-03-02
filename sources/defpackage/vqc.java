package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SettingsChimeraActivity;

/* renamed from: vqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqc implements acvv {
    private final SettingsChimeraActivity a;

    public vqc(SettingsChimeraActivity settingsChimeraActivity) {
        this.a = settingsChimeraActivity;
    }

    public final void a(Object obj) {
        SettingsChimeraActivity settingsChimeraActivity = this.a;
        Account account = (Account) obj;
        if (account == null) {
            settingsChimeraActivity.d.setText(R.string.sharing_settings_button_account_name_not_found_title);
            settingsChimeraActivity.e.setText(R.string.sharing_settings_button_account_name_not_found_description);
            settingsChimeraActivity.f.a((Object) null);
            settingsChimeraActivity.c.setOnClickListener(new vpr(settingsChimeraActivity));
        } else if (!TextUtils.equals((String) settingsChimeraActivity.c.getTag(), account.name)) {
            settingsChimeraActivity.c.setOnClickListener(new vps(settingsChimeraActivity, account));
            settingsChimeraActivity.d.setText((CharSequence) null);
            settingsChimeraActivity.e.setText(account.name);
            settingsChimeraActivity.f.a((Object) null);
            acwa b = who.b((Context) settingsChimeraActivity, account);
            b.a((acvv) new vpt(settingsChimeraActivity, account));
            b.a(vpu.a);
            settingsChimeraActivity.c.setTag(account.name);
        }
    }
}
