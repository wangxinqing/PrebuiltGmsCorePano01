package com.google.firebase.auth.api.aidlresponses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnFailedMfaSignInAidlResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apou();
    String a;
    List b;
    DefaultOAuthCredential c;

    public OnFailedMfaSignInAidlResponse(String str, List list, DefaultOAuthCredential defaultOAuthCredential) {
        this.a = str;
        this.b = list;
        this.c = defaultOAuthCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.c(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
