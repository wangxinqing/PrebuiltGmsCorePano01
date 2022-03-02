package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OptInInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qgp();
    public final int a;
    public final String b;
    @Deprecated
    public final Account[] c;

    public OptInInfo(int i, String str, Account[] accountArr) {
        this.a = i;
        this.b = str;
        this.c = accountArr;
    }

    public static OptInInfo a(int i, String str, Account[] accountArr) {
        return new OptInInfo(i, str, accountArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, (Parcelable[]) this.c, i);
        ivx.b(parcel, a2);
    }
}
