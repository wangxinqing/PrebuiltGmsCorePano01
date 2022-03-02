package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: fgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fgk implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new InternalCredentialWrapper[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        Credential credential = null;
        Account account = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                credential = (Credential) ivw.a(parcel, readInt, Credential.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                account = (Account) ivw.a(parcel, readInt, Account.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new InternalCredentialWrapper(credential, account);
    }
}
