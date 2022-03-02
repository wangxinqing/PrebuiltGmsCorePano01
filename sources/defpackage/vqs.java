package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: vqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class vqs implements acvf {
    private final SetupChimeraActivity a;

    public vqs(SetupChimeraActivity setupChimeraActivity) {
        this.a = setupChimeraActivity;
    }

    public final Object a(acwa acwa) {
        return new vvq(this.a).a((Account) acwa.d());
    }
}
