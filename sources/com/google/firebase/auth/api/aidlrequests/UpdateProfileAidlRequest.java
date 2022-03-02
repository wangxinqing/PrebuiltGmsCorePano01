package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.UserProfileChangeRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UpdateProfileAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apor();
    public final UserProfileChangeRequest a;
    public final String b;

    public UpdateProfileAidlRequest(UserProfileChangeRequest userProfileChangeRequest, String str) {
        this.a = userProfileChangeRequest;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
