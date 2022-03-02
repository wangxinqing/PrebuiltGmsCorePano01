package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManagedAccountSetupInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abph();
    public final String a;
    public final int b;
    public final String c;

    public ManagedAccountSetupInfo(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
