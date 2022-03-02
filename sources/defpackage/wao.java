package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.sharing.internal.SetAccountParams;

/* renamed from: wao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wao implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SetAccountParams[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Account account = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                iBinder = ivw.r(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new SetAccountParams(account, iBinder);
    }
}
