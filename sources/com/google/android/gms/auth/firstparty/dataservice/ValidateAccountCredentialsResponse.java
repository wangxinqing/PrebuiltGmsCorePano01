package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ValidateAccountCredentialsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gde();
    final int a;
    public final int b;
    public final String c;

    public ValidateAccountCredentialsResponse(int i) {
        this(1, i, (String) null);
    }

    public ValidateAccountCredentialsResponse(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
