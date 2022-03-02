package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CompleteSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsa();
    public final SignInCredential a;

    public CompleteSignInResult(SignInCredential signInCredential) {
        iva.a((Object) signInCredential);
        this.a = signInCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
