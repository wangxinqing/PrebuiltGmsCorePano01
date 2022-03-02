package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwt();
    public final String a;
    public final String b;
    @Deprecated
    public final Account c;

    public FileGroupRequest(String str, String str2, Account account) {
        this.a = str;
        this.b = str2;
        this.c = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
