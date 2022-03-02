package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PhoneNumberInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jpi();
    public final int a;
    public final String b;
    public final Long c;
    public final Bundle d;

    public PhoneNumberInfo(int i, String str, Long l, Bundle bundle) {
        this.a = i;
        this.b = str;
        this.c = l;
        this.d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
