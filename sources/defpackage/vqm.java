package defpackage;

import android.accounts.Account;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;
import com.google.android.gms.nearby.sharing.view.GoogleAccountAvatar;

/* renamed from: vqm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqm implements acvv {
    private final SetupChimeraActivity a;
    private final Account b;

    public vqm(SetupChimeraActivity setupChimeraActivity, Account account) {
        this.a = setupChimeraActivity;
        this.b = account;
    }

    public final void a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        Account account = this.b;
        GoogleAccountAvatar googleAccountAvatar = setupChimeraActivity.m;
        agbk g = agbl.g();
        g.a(account.name);
        g.a = ((whn) obj).a();
        googleAccountAvatar.a((Object) g.a());
        GoogleAccountAvatar googleAccountAvatar2 = setupChimeraActivity.m;
        String string = setupChimeraActivity.getString(R.string.sharing_setup_toggle_account);
        String str = account.name;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str).length());
        sb.append(string);
        sb.append(" ");
        sb.append(str);
        googleAccountAvatar2.setContentDescription(sb.toString());
    }
}
