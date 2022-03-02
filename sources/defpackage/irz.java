package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;

/* renamed from: irz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class irz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ClientContext[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Account account = null;
        Account account2 = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    i2 = ivw.g(parcel, readInt);
                    break;
                case 3:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    account2 = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    str = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    arrayList = ivw.C(parcel, readInt);
                    break;
                case 8:
                    arrayList2 = ivw.C(parcel, readInt);
                    break;
                case 9:
                    bundle = ivw.s(parcel, readInt);
                    break;
                case 10:
                    i3 = ivw.g(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new ClientContext(i, i2, account, account2, str, str2, arrayList, arrayList2, bundle, i3);
    }
}
