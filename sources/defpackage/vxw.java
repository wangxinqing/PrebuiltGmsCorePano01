package defpackage;

import android.accounts.Account;
import android.os.Parcel;

/* renamed from: vxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vxw extends bhw implements vxx {
    final /* synthetic */ acwd a;

    public vxw() {
        super("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
    }

    public final void a(Account account) {
        this.a.a((Object) account);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vxw(acwd acwd) {
        super("com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
        this.a = acwd;
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Account) bhx.a(parcel, Account.CREATOR));
        return true;
    }
}
