package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneMultiFactorInfo;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class StartMfaPhoneNumberSignInAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apon();
    public PhoneMultiFactorInfo a;
    public final String b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;

    public StartMfaPhoneNumberSignInAidlRequest(PhoneMultiFactorInfo phoneMultiFactorInfo, String str, String str2, long j, boolean z, boolean z2) {
        this.a = phoneMultiFactorInfo;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = z;
        this.f = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.a(parcel, 5, this.e);
        ivx.a(parcel, 6, this.f);
        ivx.b(parcel, a2);
    }
}
