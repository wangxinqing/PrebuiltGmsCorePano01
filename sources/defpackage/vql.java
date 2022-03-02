package defpackage;

import android.accounts.Account;
import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vql  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vql implements View.OnClickListener {
    private final SetupChimeraActivity a;
    private final Account b;

    public vql(SetupChimeraActivity setupChimeraActivity, Account account) {
        this.a = setupChimeraActivity;
        this.b = account;
    }

    public void onClick(View view) {
        who.a(this.b, (Activity) this.a);
    }
}
