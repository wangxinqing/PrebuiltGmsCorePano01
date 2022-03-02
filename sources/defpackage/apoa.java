package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlrequests.LinkPhoneAuthCredentialAidlRequest;

/* renamed from: apoa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apoa implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LinkPhoneAuthCredentialAidlRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = ivw.b(parcel);
        String str = null;
        PhoneAuthCredential phoneAuthCredential = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = ivw.a(readInt);
            if (a == 1) {
                str = ivw.q(parcel, readInt);
            } else if (a != 2) {
                ivw.b(parcel, readInt);
            } else {
                phoneAuthCredential = (PhoneAuthCredential) ivw.a(parcel, readInt, PhoneAuthCredential.CREATOR);
            }
        }
        ivw.E(parcel, b);
        return new LinkPhoneAuthCredentialAidlRequest(str, phoneAuthCredential);
    }
}
