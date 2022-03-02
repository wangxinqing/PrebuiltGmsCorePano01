package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

/* renamed from: irl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    iBinder = ivw.r(parcel, readInt);
                    break;
                case 3:
                    scopeArr = (Scope[]) ivw.b(parcel, readInt, Scope.CREATOR);
                    break;
                case 4:
                    num = ivw.h(parcel, readInt);
                    break;
                case 5:
                    num2 = ivw.h(parcel, readInt);
                    break;
                case 6:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
    }
}
