package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.LinkFederatedCredentialAidlRequest;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apnz implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LinkFederatedCredentialAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        VerifyAssertionRequest verifyAssertionRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                verifyAssertionRequest = (VerifyAssertionRequest) ivw.a(parcel, readInt, VerifyAssertionRequest.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LinkFederatedCredentialAidlRequest(str, verifyAssertionRequest);
    }
}
