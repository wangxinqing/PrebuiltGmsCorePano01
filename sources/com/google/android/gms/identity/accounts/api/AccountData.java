package com.google.android.gms.identity.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pxx();
    public final String a;
    public final String b;

    public AccountData(String str, String str2) {
        iva.a(str, (Object) "Account name must not be empty.");
        this.a = str;
        this.b = str2;
    }

    public static AccountData a(String str) {
        iva.a(str, (Object) "Account name must not be empty.");
        return new AccountData(str, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }

    public static AccountData a(String str, String str2) {
        iva.a(str, (Object) "Account name must not be empty.");
        iva.a(str2, (Object) "+Page ID must not be empty.");
        return new AccountData(str, str2);
    }
}
