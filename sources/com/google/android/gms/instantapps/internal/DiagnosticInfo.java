package com.google.android.gms.instantapps.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DiagnosticInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfv();
    public final int a;
    public final long b;
    public final int c;
    public final Account d;
    public final Account[] e;

    public DiagnosticInfo(int i, long j, int i2, Account account, Account[] accountArr) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = account;
        this.e = accountArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, this.b);
        ivx.b(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.a(parcel, 6, (Parcelable[]) this.e, i);
        ivx.b(parcel, a2);
    }
}
