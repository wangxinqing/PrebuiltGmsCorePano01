package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vxv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vxv extends bhv implements vxx {
    public vxv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.sharing.internal.IAccountResultListener");
    }

    public final void a(Account account) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) account);
        c(1, aQ);
    }
}
