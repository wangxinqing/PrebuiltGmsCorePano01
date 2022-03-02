package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.SignInWithCredentialAidlRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apoh implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SignInWithCredentialAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        VerifyAssertionRequest verifyAssertionRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                verifyAssertionRequest = (VerifyAssertionRequest) ivw.a(parcel, readInt, VerifyAssertionRequest.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SignInWithCredentialAidlRequest(verifyAssertionRequest);
    }
}
