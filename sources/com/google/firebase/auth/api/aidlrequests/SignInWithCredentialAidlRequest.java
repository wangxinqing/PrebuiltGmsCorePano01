package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInWithCredentialAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apoh();
    public final VerifyAssertionRequest a;

    public SignInWithCredentialAidlRequest(VerifyAssertionRequest verifyAssertionRequest) {
        this.a = verifyAssertionRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
