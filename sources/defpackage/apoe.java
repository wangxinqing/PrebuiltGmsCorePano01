package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.api.aidlrequests.SendVerificationCodeAidlRequest;
import com.google.firebase.auth.api.model.SendVerificationCodeRequest;

/* renamed from: apoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apoe implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendVerificationCodeAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        SendVerificationCodeRequest sendVerificationCodeRequest = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (ivw.a(readInt) != 1) {
                ivw.b(parcel, readInt);
            } else {
                sendVerificationCodeRequest = (SendVerificationCodeRequest) ivw.a(parcel, readInt, SendVerificationCodeRequest.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new SendVerificationCodeAidlRequest(sendVerificationCodeRequest);
    }
}
