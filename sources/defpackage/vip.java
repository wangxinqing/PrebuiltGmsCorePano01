package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: vip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vip implements acvf {
    private final ContactSelectChimeraActivity a;

    public vip(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.a = contactSelectChimeraActivity;
    }

    public final Object a(acwa acwa) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.a;
        if (acwa.d() == null) {
            return acws.a((Exception) new ibr(new Status(4, "Account is null")));
        }
        return new vvq(contactSelectChimeraActivity).a((Account) acwa.d());
    }
}
