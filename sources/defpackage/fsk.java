package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: fsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fsk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InternalSignInCredentialWrapper[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Account account = null;
        SignInCredential signInCredential = null;
        ArrayList arrayList = null;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            } else if (a == 2) {
                signInCredential = (SignInCredential) ivw.a(parcel, readInt, SignInCredential.CREATOR);
            } else if (a == 3) {
                arrayList = ivw.c(parcel, readInt, Scope.CREATOR);
            } else if (a != 4) {
                ivw.b(parcel, readInt);
            } else {
                z = ivw.c(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new InternalSignInCredentialWrapper(account, signInCredential, arrayList, z);
    }
}
