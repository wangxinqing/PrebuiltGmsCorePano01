package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetRecentContextCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dsr();
    public final Account a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public GetRecentContextCall$Request() {
        this((Account) null, false, false, false, (String) null);
    }

    public GetRecentContextCall$Request(Account account, boolean z, boolean z2, boolean z3, String str) {
        this.a = account;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
