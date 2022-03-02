package com.google.firebase.auth.api.aidlrequests;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SignInWithEmailLinkAidlRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apok();
    public final EmailAuthCredential a;

    public SignInWithEmailLinkAidlRequest(EmailAuthCredential emailAuthCredential) {
        this.a = emailAuthCredential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
