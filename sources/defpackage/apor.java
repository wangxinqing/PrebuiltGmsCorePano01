package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.api.aidlrequests.UpdateProfileAidlRequest;

/* renamed from: apor  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apor implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateProfileAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        UserProfileChangeRequest userProfileChangeRequest = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                userProfileChangeRequest = (UserProfileChangeRequest) ivw.a(parcel, readInt, UserProfileChangeRequest.CREATOR);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                str = ivw.q(parcel, readInt);
            }
        }
        ivw.E(parcel, b);
        return new UpdateProfileAidlRequest(userProfileChangeRequest, str);
    }
}
