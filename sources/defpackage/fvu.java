package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvu implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        Account account = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    i = ivw.g(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = ivw.c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z = ivw.c(parcel, readInt);
                    break;
                case 5:
                    z2 = ivw.c(parcel, readInt);
                    break;
                case 6:
                    z3 = ivw.c(parcel, readInt);
                    break;
                case 7:
                    str = ivw.q(parcel, readInt);
                    break;
                case 8:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 9:
                    arrayList = ivw.c(parcel, readInt, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new GoogleSignInOptions(i, arrayList2, account, z, z2, z3, str, str2, GoogleSignInOptions.a((List) arrayList), str3);
    }
}
