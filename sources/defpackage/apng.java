package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import com.google.firebase.auth.api.model.VerifyAssertionRequest;

/* renamed from: apng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apng implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DefaultOAuthCredential[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        VerifyAssertionRequest verifyAssertionRequest = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (ivw.a(readInt)) {
                case 1:
                    str = ivw.q(parcel, readInt);
                    break;
                case 2:
                    str2 = ivw.q(parcel, readInt);
                    break;
                case 3:
                    str3 = ivw.q(parcel, readInt);
                    break;
                case 4:
                    verifyAssertionRequest = (VerifyAssertionRequest) ivw.a(parcel, readInt, VerifyAssertionRequest.CREATOR);
                    break;
                case 5:
                    str4 = ivw.q(parcel, readInt);
                    break;
                case 6:
                    str5 = ivw.q(parcel, readInt);
                    break;
                case 7:
                    str6 = ivw.q(parcel, readInt);
                    break;
                default:
                    ivw.b(parcel, readInt);
                    break;
            }
        }
        ivw.E(parcel, b);
        return new DefaultOAuthCredential(str, str2, str3, verifyAssertionRequest, str4, str5, str6);
    }
}
