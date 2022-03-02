package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: itk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itk extends bhv implements itm {
    public itk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account a() {
        Parcel a = a(2, aQ());
        Account account = (Account) bhx.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
