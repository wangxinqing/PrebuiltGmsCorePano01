package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FACLData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gec();
    final int a;
    public FACLConfig b;
    public String c;
    public boolean d;
    String e;

    public FACLData(int i, FACLConfig fACLConfig, String str, boolean z, String str2) {
        this.a = i;
        this.b = fACLConfig;
        this.c = str;
        this.d = z;
        this.e = str2;
    }

    public FACLData(FACLConfig fACLConfig, String str, String str2, boolean z) {
        this.a = 1;
        this.b = fACLConfig;
        this.c = str;
        this.e = str2;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e, false);
        ivx.b(parcel, a2);
    }
}
