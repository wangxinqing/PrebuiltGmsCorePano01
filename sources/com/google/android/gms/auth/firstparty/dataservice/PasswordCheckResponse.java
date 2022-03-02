package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PasswordCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcu();
    final int a;
    String b;
    String c;
    String d;

    public PasswordCheckResponse(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public PasswordCheckResponse(gei gei) {
        this(gei, (String) null, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }

    public PasswordCheckResponse(gei gei, String str, String str2) {
        this.a = 1;
        iva.a((Object) gei);
        this.b = gei.ac;
        this.c = str;
        this.d = str2;
    }
}
