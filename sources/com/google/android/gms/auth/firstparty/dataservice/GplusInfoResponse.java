package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GplusInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcn();
    final int a;
    boolean b;
    String c;
    String d;
    String e;
    boolean f;
    boolean g;
    String h;
    String i;
    String j;

    public GplusInfoResponse(int i2, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6) {
        this.a = i2;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }

    public GplusInfoResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = 1;
        this.b = false;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.h = str4;
        this.i = str5;
        this.f = false;
        this.g = false;
        this.j = str6;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f);
        ivx.a(parcel, 7, this.g);
        ivx.a(parcel, 8, this.h, false);
        ivx.a(parcel, 9, this.i, false);
        ivx.a(parcel, 10, this.j, false);
        ivx.b(parcel, a2);
    }
}
