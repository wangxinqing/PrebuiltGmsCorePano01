package com.google.firebase.auth.api.aidlresponses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnFailedIdpSignInAidlResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apot();
    public final Status a;
    public final DefaultOAuthCredential b;
    public final String c;
    public final String d;

    public OnFailedIdpSignInAidlResponse(Status status, DefaultOAuthCredential defaultOAuthCredential, String str, String str2) {
        this.a = status;
        this.b = defaultOAuthCredential;
        this.c = str;
        this.d = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
