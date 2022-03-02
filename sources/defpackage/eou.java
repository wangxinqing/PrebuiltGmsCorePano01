package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: eou  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eou extends bhw implements eov {
    final /* synthetic */ acwd a;

    public eou() {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    public final void a(Status status, List list) {
        ihd.a(status, list, this.a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eou(acwd acwd) {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a((Status) bhx.a(parcel, Status.CREATOR), parcel.createTypedArrayList(Account.CREATOR));
        return true;
    }
}
