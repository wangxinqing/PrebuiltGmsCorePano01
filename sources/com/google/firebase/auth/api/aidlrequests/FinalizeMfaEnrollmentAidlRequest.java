package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FinalizeMfaEnrollmentAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apnu();
    public final PhoneAuthCredential a;
    public final String b;
    public final String c;

    public FinalizeMfaEnrollmentAidlRequest(PhoneAuthCredential phoneAuthCredential, String str, String str2) {
        this.a = phoneAuthCredential;
        this.b = str;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
