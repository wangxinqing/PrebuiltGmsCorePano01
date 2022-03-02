package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vqu implements acvv {
    private final SetupChimeraActivity a;

    public vqu(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public final void a(Object obj) {
        SetupChimeraActivity setupChimeraActivity = this.a;
        Account account = (Account) obj;
        if (account == null) {
            setupChimeraActivity.m.a((Object) null);
            setupChimeraActivity.m.setOnClickListener(new vqk(setupChimeraActivity));
        } else if (!account.equals(setupChimeraActivity.m.getTag(R.id.change_account))) {
            setupChimeraActivity.m.setTag(R.id.change_account, account);
            setupChimeraActivity.m.setOnClickListener(new vql(setupChimeraActivity, account));
            setupChimeraActivity.m.a((Object) null);
            acwa b = who.b((Context) setupChimeraActivity, account);
            b.a((acvv) new vqm(setupChimeraActivity, account));
            b.a(vqn.a);
        }
    }
}
