package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckRealNameResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gbl();
    final int a;
    String b;

    public CheckRealNameResponse(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public CheckRealNameResponse(gei gei) {
        this.a = 1;
        iva.a((Object) gei);
        this.b = gei.ac;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
