package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PinSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcw();
    final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public PinSettings(int i, String str, String str2, String str3, String str4, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, 5, this.f);
        ivx.a(parcel, 6, this.e, false);
        ivx.b(parcel, a2);
    }
}
